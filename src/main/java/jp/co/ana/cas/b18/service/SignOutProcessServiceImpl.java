package jp.co.ana.cas.b18.service;

import java.util.Objects;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jp.co.ana.cas.b18.connector.pnraddmultielements.PNRAddMultiElementsConnector;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElements;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReplyResponseDto;
import jp.co.ana.cas.b18.dto.response.PnrAddMultiElementsRequestDto;
import jp.co.ana.cas.b18.dto.response.PnrReplyResponseDto;
import jp.co.ana.cas.b18.dto.response.SignOutProcessRequestDto;
import jp.co.ana.cas.b18.dto.response.SignOutProcessResponseDto;
import jp.co.ana.cas.resources.handler.RecordNotFoundException;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class SignOutProcessServiceImpl implements SignOutProcessService {

	@Value("${app.error.msg.record-not-found}")
	private String recordNotFound;

	@Autowired
	PNRAddMultiElementsConnector addMultiElementsConnector;

	@Autowired
	ModelMapper modelMapper;

	public PNRReplyResponseDto pnrAddMultiElementsInputRequest(SignOutProcessRequestDto processRequestDto) {
		PnrAddMultiElementsRequestDto elementsRequestDto = processRequestDto.getPnrAddMultiElements();
		PNRAddMultiElements addMultiElements = modelMapper.map(elementsRequestDto, PNRAddMultiElements.class);

		log.debug("Sending request to ALTEA for retrieving PNR Add Multi Elements");
		PNRReplyResponseDto pnrReply = addMultiElementsConnector.getSoapFrontResponse(addMultiElements);
		if (pnrReply == null) {
			throw new RecordNotFoundException(recordNotFound);
		}

		return pnrReply;
	}

	@Override
	public SignOutProcessResponseDto getSignOutProcess(SignOutProcessRequestDto requestDto) {
		SignOutProcessResponseDto processResponseDto = new SignOutProcessResponseDto();
		if (Objects.nonNull(processResponseDto)) {
			PNRReplyResponseDto pnrReply = pnrAddMultiElementsInputRequest(requestDto);

			PnrReplyResponseDto pnrReplyResponseDto = modelMapper.map(pnrReply.getSoapBody().getPnrreply(),
					PnrReplyResponseDto.class);
			processResponseDto.setPnrReply(pnrReplyResponseDto);
		}

		return processResponseDto;
	}

}
