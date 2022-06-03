package jp.co.ana.cas.b18.connector.pnraddmultielements;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jp.co.ana.cas.b18.connector.pnraddmultielements.client.PNRAddMultiElementsFeignClient;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElements;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElementsBodyDto;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElementsRequestDto;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReplyResponseDto;


@Component
public class PNRAddMultiElementsConnectorImpl implements PNRAddMultiElementsConnector {

	/** The Service Integrated Catalogue feign client. */

	@Autowired
	private PNRAddMultiElementsFeignClient feignClient;
	/**
	 * Soapfront connector url.
	 */
	@Value("${endpoint.request.pnrAddMultiElements-url}")
	private String url;

	/**
	 * Gets the soap front response.
	 *
	 * @param serviceIntegratedCatalogue the service integrated catalogue
	 * @return the soap front response
	 */
	@Override
	public PNRReplyResponseDto getSoapFrontResponse(PNRAddMultiElements addMultiElements) {
		PNRAddMultiElementsRequestDto addMultiElementsRequestDto = getPNRAddMultiElementsRequestDto(addMultiElements);
		PNRReplyResponseDto pnrReplyResponseDto = null;
		pnrReplyResponseDto = feignClient.resultApi(addMultiElementsRequestDto, url).getBody();
		return getPNRReply(pnrReplyResponseDto);
	}

	/**
	 * Gets the PNR Reply.
	 *
	 * @param pnrReplyResponseDto the PNR reply response dto
	 * @return the PNRreply
	 */
	private PNRReplyResponseDto getPNRReply(PNRReplyResponseDto pnrReplyResponseDto) {
		PNRReplyResponseDto serviceIntegratedCatalogueReply = null;
		if (Objects.nonNull(pnrReplyResponseDto) && Objects.nonNull(pnrReplyResponseDto.getSoapBody())) {
			serviceIntegratedCatalogueReply = pnrReplyResponseDto;
		}
		return serviceIntegratedCatalogueReply;
	}

	/**
	 * Gets the service integrated catalogue request dto.
	 *
	 * @param serviceIntegratedCatalogue the service integrated catalogue
	 * @return the service integrated catalogue request dto
	 */
	private PNRAddMultiElementsRequestDto getPNRAddMultiElementsRequestDto(PNRAddMultiElements addMultiElements) {
		PNRAddMultiElementsBodyDto addMultiElementsBodyDto = new PNRAddMultiElementsBodyDto();
		addMultiElementsBodyDto.setPnraddMultiElements(addMultiElements);

		PNRAddMultiElementsRequestDto addMultiElementsRequestDto = new PNRAddMultiElementsRequestDto();
		addMultiElementsRequestDto.setSoapBody(addMultiElementsBodyDto);
		return addMultiElementsRequestDto;
	}

}
