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

import jp.co.ana.cas.b18.connector.commandcryptic.CommandCrypticConnectorImpl;
import jp.co.ana.cas.b18.connector.commandcryptic.client.CommandCrypticFeignClient;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCryptic;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticBodyDto;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReply;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReplyResponseDto;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticRequestDto;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReplyResponseDto;
import jp.co.ana.cas.template.Application;

/**
 * The Class CommandCrypticConnectorTest.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = Application.class)
class CommandCrypticConnectorTest {

	/** The service integrated catalogue feign client. */
	// (2) DI the mock Feign client class
	@Mock
	private CommandCrypticFeignClient feignClient;

	/** The connector. */
	// (3) DI the connector injected with the mock of the service layer class
	@InjectMocks
	private CommandCrypticConnectorImpl connector;

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

		CommandCryptic commandCryptic = mapper.readValue(
				new File("src/test/java/jp/co/ana/cas/template/connector/cmd_cryptic_request.json"),
				new TypeReference<CommandCryptic>() {
				});

		CommandCrypticBodyDto commandCrypticBodyDto = new CommandCrypticBodyDto();
		commandCrypticBodyDto.setCommandCryptic(commandCryptic);

		CommandCrypticRequestDto commandCrypticRequestDto = new CommandCrypticRequestDto();
		commandCrypticRequestDto.setSoapBody(commandCrypticBodyDto);

		CommandCrypticReplyResponseDto crypticReplyResponseDto = mapper.readValue(
				new File("src/test/java/jp/co/ana/cas/template/connector/cmd_cryptic_Replyresponse.json"),
				new TypeReference<CommandCrypticReplyResponseDto>() {
				});

		ResponseEntity<CommandCrypticReplyResponseDto> responseEntity = generateResponseEntity(crypticReplyResponseDto);

		CommandCrypticReply expected = mapper.readValue(
				new File("src/test/java/jp/co/ana/cas/template/connector/cmd_cryptic_Reply.json"),
				new TypeReference<CommandCrypticReply>() {
				});

		// (1) Set the behavior of the mocked service.
		ReflectionTestUtils.setField(connector, "url", "xmlResponse");
		doReturn(responseEntity).when(feignClient).resultApi(commandCrypticRequestDto, "xmlResponse");
		// (2) Execute test case and hit the mocked class
		CommandCrypticReply actual = connector.getSoapFrontResponse(commandCryptic);

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
	private ResponseEntity<CommandCrypticReplyResponseDto> generateResponseEntity(
			CommandCrypticReplyResponseDto crypticReplyResponseDto) {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<>(crypticReplyResponseDto, header, HttpStatus.OK);
	}

}
