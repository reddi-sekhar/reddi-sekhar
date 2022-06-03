package jp.co.ana.cas.template.connector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.util.ReflectionTestUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jp.co.ana.cas.b18.connector.pnraddmultielements.PNRAddMultiElementsConnectorImpl;
import jp.co.ana.cas.b18.connector.pnraddmultielements.client.PNRAddMultiElementsFeignClient;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElements;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElementsBodyDto;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElementsRequestDto;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReply;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReplyResponseDto;
import jp.co.ana.cas.template.Application;

/**
 * The Class SignInPnrAddMultiElementsConnectorTest.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = Application.class)
class SignInPnrAddMultiElementsConnectorTest {

	/** The service integrated catalogue feign client. */
	// (2) DI the mock Feign client class
	@Mock
	private PNRAddMultiElementsFeignClient addMultiElementsFeignClient;

	/** The connector. */
	// (3) DI the connector injected with the mock of the service layer class
	@InjectMocks
	private PNRAddMultiElementsConnectorImpl connector;

	/**
	 * Test connector.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void test_connector() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		mapper.setDateFormat(df);

		PNRAddMultiElements addMultiElements = mapper.readValue(new File(
				"src/test/java/jp/co/ana/cas/template/connector/addMultiElems.json"),
				new TypeReference<PNRAddMultiElements>() {
				});

		PNRAddMultiElementsBodyDto addMultiElementsBodyDto = new PNRAddMultiElementsBodyDto();
		addMultiElementsBodyDto.setPnraddMultiElements(addMultiElements);

		PNRAddMultiElementsRequestDto addMultiElementsRequestDto = new PNRAddMultiElementsRequestDto();
		addMultiElementsRequestDto.setSoapBody(addMultiElementsBodyDto);

		PNRReplyResponseDto pnrReplyResponseDto = mapper.readValue(new File(
				"src/test/java/jp/co/ana/cas/template/connector/PNRreplyresponse.json"),
				new TypeReference<PNRReplyResponseDto>() {
				});

		ResponseEntity<PNRReplyResponseDto> responseEntity = generateResponseEntity(pnrReplyResponseDto);

		PNRReply expected = mapper.readValue(new File(
				"src/test/java/jp/co/ana/cas/template/connector/pnraddMultiReply.json"),
				new TypeReference<PNRReply>() {
				});

		// (1) Set the behavior of the mocked service.
		ReflectionTestUtils.setField(connector, "url", "xmlResponse");
		doReturn(responseEntity).when(addMultiElementsFeignClient).resultApi(addMultiElementsRequestDto, "xmlResponse");
		// (2) Execute test case and hit the mocked class
		PNRReplyResponseDto actual = connector.getSoapFrontResponse(addMultiElements);

		// (3) Verify test Result
		assertEquals(expected.toString().replaceAll("\\s+", ""), actual.toString().replaceAll("\\s+", ""),
				"Response not matching");
	}

	/**
	 * Generate response entity.
	 *
	 * @param serviceIntegratedCatalogueReplyResponseDto the service integrated
	 *                                                   catalogue reply response
	 *                                                   dto
	 * @return the response entity
	 */
	private ResponseEntity<PNRReplyResponseDto> generateResponseEntity(PNRReplyResponseDto pnrReplyResponseDto) {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<>(pnrReplyResponseDto, header, HttpStatus.OK);
	}

}
