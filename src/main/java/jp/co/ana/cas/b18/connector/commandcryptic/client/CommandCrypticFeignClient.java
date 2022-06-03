package jp.co.ana.cas.b18.connector.commandcryptic.client;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReplyResponseDto;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticRequestDto;

@ComponentScan
@FeignClient(name = "${feign.client.name2}", url = "${feign.client.baseurl}")
public interface CommandCrypticFeignClient {

	/**
	 * Result api.
	 *airport.service.name
	 * @param req the req
	 * @param url the url
	 * @return the response entity
	 */
	@PostMapping(value = "/{requrl}")
	public ResponseEntity<CommandCrypticReplyResponseDto> resultApi(@RequestBody @Valid CommandCrypticRequestDto req,
			@PathVariable("requrl") String url);

}
