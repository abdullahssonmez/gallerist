package com.abdullahssonmez.service;

import com.abdullahssonmez.dto.DtoAccount;
import com.abdullahssonmez.dto.DtoAccountIU;

public interface IAccountService {

	public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);
}
