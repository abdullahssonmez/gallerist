package com.abdullahssonmez.controller;

import com.abdullahssonmez.dto.AuthRequest;
import com.abdullahssonmez.dto.AuthResponse;
import com.abdullahssonmez.dto.DtoUser;
import com.abdullahssonmez.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
