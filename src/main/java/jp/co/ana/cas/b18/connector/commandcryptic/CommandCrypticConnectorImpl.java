package jp.co.ana.cas.b18.connector.commandcryptic;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jp.co.ana.cas.b18.connector.commandcryptic.client.CommandCrypticFeignClient;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCryptic;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticBodyDto;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReply;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReplyResponseDto;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticRequestDto;

@Component
public class CommandCrypticConnectorImpl implements CommandCrypticConnector {

	@Autowired
	private CommandCrypticFeignClient feignClient;

	@Value("${endpoint.request.commandcryptic-url}")
	private String url;

	@Override
	public CommandCrypticReply getSoapFrontResponse(CommandCryptic commandCryptic) {
		CommandCrypticRequestDto commandCrypticRequestDto = getCommandCrypticRequestDto(commandCryptic);
		CommandCrypticReplyResponseDto commandCrypticReplyResponseDto = null;
		commandCrypticReplyResponseDto = feignClient.resultApi(commandCrypticRequestDto, url).getBody();
		return getCommandCrypticReply(commandCrypticReplyResponseDto);
	}

	/**
	 * Gets the PNR Reply.
	 *
	 * @param CommandCrypticReplyResponseDto the PNR reply response dto
	 * @return the PNRreply
	 */
	private CommandCrypticReply getCommandCrypticReply(CommandCrypticReplyResponseDto commandCrypticReplyResponseDto) {
		CommandCrypticReply commandCrypticReply = null;
		if (Objects.nonNull(commandCrypticReplyResponseDto)
				&& Objects.nonNull(commandCrypticReplyResponseDto.getSoapBody())) {
			commandCrypticReply = commandCrypticReplyResponseDto.getSoapBody().getCommandCrypticReply();
		}
		return commandCrypticReply;
	}

	private CommandCrypticRequestDto getCommandCrypticRequestDto(CommandCryptic commandCryptic) {
		CommandCrypticBodyDto commandCrypticBodyDto = new CommandCrypticBodyDto();
		commandCrypticBodyDto.setCommandCryptic(commandCryptic);

		CommandCrypticRequestDto commandCrypticRequestDto = new CommandCrypticRequestDto();
		commandCrypticRequestDto.setSoapBody(commandCrypticBodyDto);
		return commandCrypticRequestDto;
	}

}
