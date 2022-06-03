package jp.co.ana.cas.b18.connector.pnraddmultielements.client;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElementsRequestDto;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReplyResponseDto;

@ComponentScan
@FeignClient(name = "${feign.client.name}", url = "${feign.client.baseurl}")
public interface PNRAddMultiElementsFeignClient {

	/**
	 * Result api.
	 *
	 * @param req the req
	 * @param url the url
	 * @return the response entity
	 */
	@PostMapping(value = "/{requrl}")
	public ResponseEntity<PNRReplyResponseDto> resultApi(@RequestBody @Valid PNRAddMultiElementsRequestDto req,
			@PathVariable("requrl") String url);

}
