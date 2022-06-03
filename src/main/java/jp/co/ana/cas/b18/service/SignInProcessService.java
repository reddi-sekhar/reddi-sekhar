package jp.co.ana.cas.b18.service;

import jp.co.ana.cas.b18.dto.response.SignInProcessRequestDto;
import jp.co.ana.cas.b18.dto.response.SignInProcessResponseDto;

/**
 *
 *
 */
public interface SignInProcessService {

	public SignInProcessResponseDto getSignInProcess(SignInProcessRequestDto requestDto);
}
