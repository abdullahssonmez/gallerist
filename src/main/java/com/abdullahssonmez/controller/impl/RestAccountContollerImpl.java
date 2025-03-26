package com.abdullahssonmez.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullahssonmez.controller.IRestAccountController;
import com.abdullahssonmez.controller.RestBaseController;
import com.abdullahssonmez.controller.RootEntity;
import com.abdullahssonmez.dto.DtoAccount;
import com.abdullahssonmez.dto.DtoAccountIU;
import com.abdullahssonmez.service.IAccountService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/account")
public class RestAccountContollerImpl extends RestBaseController implements IRestAccountController {

	@Autowired
	private IAccountService accountService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoAccount> saveAccount(@Valid @RequestBody DtoAccountIU dtoAccountIU) {
		return ok(accountService.saveAccount(dtoAccountIU));
	}

}
