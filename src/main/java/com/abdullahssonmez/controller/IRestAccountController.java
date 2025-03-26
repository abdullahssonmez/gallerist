package com.abdullahssonmez.controller;

import com.abdullahssonmez.dto.DtoAccount;
import com.abdullahssonmez.dto.DtoAccountIU;

public interface IRestAccountController {

	public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);
}
