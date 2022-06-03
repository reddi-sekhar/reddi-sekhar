package jp.co.ana.cas.b18.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.ana.cas.b18.dto.response.SignInProcessRequestDto;
import jp.co.ana.cas.b18.dto.response.SignInProcessResponseDto;
import jp.co.ana.cas.b18.service.SignInProcessService;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-05T19:39:04.755304300+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.marvelBUSINESSRITGUIAPIMARBB18.base-path:}")
public class SigninProcessApiController implements SigninProcessApi {

    @Autowired
    SignInProcessService service;

    @Override
	public ResponseEntity<SignInProcessResponseDto> doSignInProcessInput(
			@RequestBody SignInProcessRequestDto processRequestDto) {
    	SignInProcessResponseDto response = service.getSignInProcess(processRequestDto);
      return new ResponseEntity<SignInProcessResponseDto>(response, HttpStatus.OK);
    }


}
