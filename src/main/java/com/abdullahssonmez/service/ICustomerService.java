package com.abdullahssonmez.service;

import com.abdullahssonmez.dto.DtoCustomer;
import com.abdullahssonmez.dto.DtoCustomerIU;

public interface ICustomerService {

	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
}
