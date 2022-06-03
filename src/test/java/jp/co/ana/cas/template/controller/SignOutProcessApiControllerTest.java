package jp.co.ana.cas.template.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jp.co.ana.cas.b18.controller.SignoutProcessApiController;
import jp.co.ana.cas.b18.dto.response.SignOutProcessRequestDto;
import jp.co.ana.cas.b18.dto.response.SignOutProcessResponseDto;
import jp.co.ana.cas.b18.service.SignOutProcessServiceImpl;
import jp.co.ana.cas.template.Application;

/**
 * The Class FbagInputApiControllerTest.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = Application.class)
class SignOutProcessApiControllerTest {

	
	@Autowired
	private MockMvc mockMvc;

	/** The service. */
	// (2) DI the mock service class
	@MockBean
	private SignOutProcessServiceImpl service;

	/** The controller. */
	// (3) DI the controller injected with the mock of the service layer class
	@InjectMocks
	private SignoutProcessApiController controller;

	/**
	 * Test get loading list result.
	 *
	 * @throws Exception mock exception.
	 * 
	 */
	@Test
	void test_controller() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		mapper.setDateFormat(df);

		SignOutProcessRequestDto inProcessRequestDto = mapper.readValue(
				new File("src/test/java/jp/co/ana/cas/template/signOutRequest.json"),
				new TypeReference<SignOutProcessRequestDto>() {
				});

		SignOutProcessResponseDto inProcessResponseDto = mapper.readValue(
				new File("src/test/java/jp/co/ana/cas/template/signOutReply.json"),
				new TypeReference<SignOutProcessResponseDto>() {
				});
		// (1) Set the behavior of the mocked service.
		doReturn(inProcessResponseDto).when(service).getSignOutProcess(inProcessRequestDto);

		// (2) Definition of the response body to be used
		String responseBody = mapper.writeValueAsString(inProcessRequestDto);

		// (3) Hit the mocked API -
		this.mockMvc
				.perform(post("/service1/signout-input").contentType(MediaType.APPLICATION_JSON)
						.content(mapper.writeValueAsString(inProcessRequestDto)))
				.andExpect(status().isOk()).andExpect(content().json(responseBody));

		ArgumentCaptor<SignOutProcessRequestDto> argumentCaptor = ArgumentCaptor.forClass(SignOutProcessRequestDto.class);

		verify(service, times(1)).getSignOutProcess(inProcessRequestDto);

		// (4) Check the arguments for the class of the Service layer

		assertEquals(inProcessRequestDto.getPnrAddMultiElements().getTravellerInfo().get(0).getPassengerData(),
				argumentCaptor.getAllValues().get(0).getPnrAddMultiElements().getTravellerInfo().get(0)
						.getPassengerData());
	}

}
