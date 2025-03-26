package com.abdullahssonmez.controller;

import com.abdullahssonmez.dto.DtoCustomer;
import com.abdullahssonmez.dto.DtoCustomerIU;

public interface IRestCustomerController {

	public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
