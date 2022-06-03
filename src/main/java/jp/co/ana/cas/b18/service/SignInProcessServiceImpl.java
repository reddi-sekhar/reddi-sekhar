package jp.co.ana.cas.b18.service;

import java.util.Objects;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jp.co.ana.cas.b18.connector.commandcryptic.CommandCrypticConnector;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCryptic;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReply;
import jp.co.ana.cas.b18.connector.pnraddmultielements.PNRAddMultiElementsConnector;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElements;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReply;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReplyResponseDto;
import jp.co.ana.cas.b18.dto.response.CommandCrypticReplyResponseDto;
import jp.co.ana.cas.b18.dto.response.CommandCrypticRequestDto;
import jp.co.ana.cas.b18.dto.response.PnrAddMultiElementsRequestDto;
import jp.co.ana.cas.b18.dto.response.PnrReplyResponseDto;
import jp.co.ana.cas.b18.dto.response.PnrReplyResponseDtoPnrHeaderTag;
import jp.co.ana.cas.b18.dto.response.SignInProcessRequestDto;
import jp.co.ana.cas.b18.dto.response.SignInProcessResponseDto;
import jp.co.ana.cas.resources.handler.RecordNotFoundException;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class SignInProcessServiceImpl implements SignInProcessService {

	@Value("${app.error.msg.record-not-found}")
	private String recordNotFound;

	@Autowired
	PNRAddMultiElementsConnector addMultiElementsConnector;

	@Autowired
	CommandCrypticConnector commandCrypticConnector;

	@Autowired
	ModelMapper modelMapper;

	public PNRReplyResponseDto pnrAddMultiElementsInputRequest(SignInProcessRequestDto processRequestDto) {
		PnrAddMultiElementsRequestDto elementsRequestDto = processRequestDto.getPnrAddMultiElements();
		PNRAddMultiElements addMultiElements = modelMapper.map(elementsRequestDto, PNRAddMultiElements.class);

		log.debug("Sending request to ALTEA for retrieving PNR Add Multi Elements");
		PNRReplyResponseDto pnrReply = addMultiElementsConnector.getSoapFrontResponse(addMultiElements);
		if (pnrReply == null) {
			throw new RecordNotFoundException(recordNotFound);
		}

		return pnrReply;
	}

	public CommandCrypticReply commandCrypticInputRequest(SignInProcessRequestDto processRequestDto) {
		CommandCrypticRequestDto elementsRequestDto = processRequestDto.getCommandCryptic();
		CommandCryptic commandCryptic = modelMapper.map(elementsRequestDto, CommandCryptic.class);

		log.debug("Sending request to ALTEA for retrieving Command Cryptic Reply");
		CommandCrypticReply commandCrypticReply = commandCrypticConnector.getSoapFrontResponse(commandCryptic);
		if (commandCrypticReply == null) {
			throw new RecordNotFoundException(recordNotFound);
		}

		return commandCrypticReply;
	}

	@Override
	public SignInProcessResponseDto getSignInProcess(SignInProcessRequestDto requestDto) {
		SignInProcessResponseDto processResponseDto = new SignInProcessResponseDto();
		if (Objects.nonNull(processResponseDto)) {
			PNRReplyResponseDto pnrReply = pnrAddMultiElementsInputRequest(requestDto);

			// TODO: need to verify
			PnrReplyResponseDto pnrReplyResponseDto = modelMapper.map(pnrReply.getSoapBody().getPnrreply(),
					PnrReplyResponseDto.class);

			CommandCrypticReply commandCrypticReply = commandCrypticInputRequest(requestDto);
			CommandCrypticReplyResponseDto replyResponseDto = modelMapper.map(commandCrypticReply,
					CommandCrypticReplyResponseDto.class);

			processResponseDto.setPnrReply(pnrReplyResponseDto);
			processResponseDto.setCommandCrypticReply(replyResponseDto);

		}

		return processResponseDto;
	}

}
