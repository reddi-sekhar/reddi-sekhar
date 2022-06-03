package jp.co.ana.cas.b18.service;

import jp.co.ana.cas.b18.dto.response.SignOutProcessRequestDto;
import jp.co.ana.cas.b18.dto.response.SignOutProcessResponseDto;

/**
 *
 *
 */
public interface SignOutProcessService {

	public SignOutProcessResponseDto getSignOutProcess(SignOutProcessRequestDto requestDto);
}
