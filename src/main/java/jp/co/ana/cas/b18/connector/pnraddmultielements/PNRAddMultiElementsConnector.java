package jp.co.ana.cas.b18.connector.pnraddmultielements;

import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElements;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReplyResponseDto;

public interface PNRAddMultiElementsConnector {

	/**
	 * Gets the soap front response.
	 *
	 * @param PNRAddMultiElements the command cryptic
	 * @return the soap front response
	 */
	public PNRReplyResponseDto getSoapFrontResponse(PNRAddMultiElements addMultiElements);

}