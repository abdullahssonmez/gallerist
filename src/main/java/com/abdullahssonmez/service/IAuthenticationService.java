package com.abdullahssonmez.service;

import com.abdullahssonmez.dto.AuthRequest;
import com.abdullahssonmez.dto.AuthResponse;
import com.abdullahssonmez.dto.DtoUser;
import com.abdullahssonmez.dto.RefreshTokenRequest;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
