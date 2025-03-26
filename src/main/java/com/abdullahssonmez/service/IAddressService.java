package com.abdullahssonmez.service;

import com.abdullahssonmez.dto.DtoAddress;
import com.abdullahssonmez.dto.DtoAddressIU;

public interface IAddressService {

	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}
