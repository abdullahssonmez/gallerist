package com.abdullahssonmez.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullahssonmez.controller.IRestCustomerController;
import com.abdullahssonmez.controller.RestBaseController;
import com.abdullahssonmez.controller.RootEntity;
import com.abdullahssonmez.dto.DtoCustomer;
import com.abdullahssonmez.dto.DtoCustomerIU;
import com.abdullahssonmez.service.ICustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/customer")
public class RestCustomerControllerImpl extends RestBaseController implements IRestCustomerController {

	@Autowired
	private ICustomerService customerService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoCustomer> saveCustomer(@Valid @RequestBody DtoCustomerIU dtoCustomerIU) {
		return ok(customerService.saveCustomer(dtoCustomerIU));
	}

}
