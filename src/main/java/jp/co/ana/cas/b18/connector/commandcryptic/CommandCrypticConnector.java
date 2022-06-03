package jp.co.ana.cas.b18.connector.commandcryptic;

import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCryptic;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReply;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElements;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReply;
import jp.co.ana.cas.b18.dto.response.CommandCrypticRequestDto;

public interface CommandCrypticConnector {

	/**
	 * Gets the soap front response.
	 *
	 * @param commandCryptic the command cryptic
	 * @return the soap front response
	 */
	public CommandCrypticReply getSoapFrontResponse(CommandCryptic commandCryptic);

}