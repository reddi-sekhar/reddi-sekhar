package jp.co.ana.cas.template.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.util.ReflectionTestUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jp.co.ana.cas.b18.connector.commandcryptic.CommandCrypticConnector;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCryptic;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReply;
import jp.co.ana.cas.b18.connector.pnraddmultielements.PNRAddMultiElementsConnector;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElements;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReply;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReplyResponseDto;
import jp.co.ana.cas.b18.dto.response.SignOutProcessRequestDto;
import jp.co.ana.cas.b18.dto.response.SignOutProcessResponseDto;
import jp.co.ana.cas.b18.dto.response.SignOutProcessRequestDto;
import jp.co.ana.cas.b18.dto.response.SignOutProcessResponseDto;
import jp.co.ana.cas.b18.service.SignOutProcessServiceImpl;
import jp.co.ana.cas.resources.handler.RecordNotFoundException;
import jp.co.ana.cas.template.Application;

/**
 * The Class FbagInputServiceImplTest.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = Application.class)
class SignOutProcessServiceImplTest {

	/** The service impl. */
	@InjectMocks
	SignOutProcessServiceImpl serviceImpl;

	/** The service integrated catalogue connector. */
	@Mock
	PNRAddMultiElementsConnector addMultiElementsConnector;

	/** The model mapper. */
	@Mock
	ModelMapper modelMapper;

	/**
	 * Test get loading list result.
	 *
	 * @throws Exception Signals that an exception has occurred.
	 */
	@Test
	public void test_service() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		mapper.setDateFormat(df);

		SignOutProcessRequestDto requestDto = mapper.readValue(
				new File("src/test/java/jp/co/ana/cas/template/signOutRequest.json"),
				new TypeReference<SignOutProcessRequestDto>() {
				});

		SignOutProcessResponseDto expectedData = mapper.readValue(
				new File("src/test/java/jp/co/ana/cas/template/signOutReply.json"),
				new TypeReference<SignOutProcessResponseDto>() {
				});

		PNRAddMultiElements multiElementsRequest = mapper.readValue(new File(
				"src/test/java/jp/co/ana/cas/template/connector/addMultiElems.json"),
				new TypeReference<PNRAddMultiElements>() {
				});

		PNRReplyResponseDto pnrReply = mapper.readValue(new File(
				"src/test/java/jp/co/ana/cas/template/connector/PNRreplyresponse.json"),
				new TypeReference<PNRReplyResponseDto>() {
				});

		// (1) Set the behavior of the mocked class
		doReturn(pnrReply).when(addMultiElementsConnector).getSoapFrontResponse(ArgumentMatchers.any());

		doReturn(multiElementsRequest).when(modelMapper).map(requestDto.getPnrAddMultiElements(),
				PNRAddMultiElements.class);

		doReturn(expectedData.getPnrReply()).when(modelMapper).map(pnrReply, PNRReply.class);

		// CommandCryptic

		CommandCryptic commandCrypticRequest = mapper.readValue(new File(
				"src/test/java/jp/co/ana/cas/template/connector/cmd_cryptic_request.json"),
				new TypeReference<CommandCryptic>() {
				});

		CommandCrypticReply crypticReplyResponse = mapper.readValue(new File(
				"src/test/java/jp/co/ana/cas/template/connector/cmd_cryptic_Reply.json"),
				new TypeReference<CommandCrypticReply>() {
				});

		// (2) Execute test case and hit the mocked class
		SignOutProcessResponseDto actualResponse = serviceImpl.getSignOutProcess(requestDto);

		// (3) Verify test Result
		//assertEquals(expectedData, actualResponse, "Response not matching");
		assertNotNull(actualResponse);
	}

	/**
	 * Test service with error.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void test_service_With_Error() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		mapper.setDateFormat(df);

		SignOutProcessRequestDto requestDto = mapper.readValue(
				new File("src/test/java/jp/co/ana/cas/template/signOutRequest.json"),
				new TypeReference<SignOutProcessRequestDto>() {
				});

		SignOutProcessResponseDto soapFrontRespose = null;
		PNRAddMultiElements inputData = mapper.readValue(new File(
				"src/test/java/jp/co/ana/cas/template/pnrAddMultiElements.json"),
				new TypeReference<PNRAddMultiElements>() {
				});

		ReflectionTestUtils.setField(serviceImpl, "recordNotFound",
				"Records matching the required conditions not found");

		// (1) Set the behavior of the mocked class
		doReturn(soapFrontRespose).when(addMultiElementsConnector).getSoapFrontResponse(inputData);

		// (2) Execute test case and hit the mocked class
		Exception exception = assertThrows(RecordNotFoundException.class,
				() -> serviceImpl.getSignOutProcess(requestDto));

		// (3) Check the expected response
		assertTrue(exception.getMessage().contains("Records matching the required conditions not found"));
	}
}
