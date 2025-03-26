package com.abdullahssonmez.controller;

import com.abdullahssonmez.dto.DtoAddress;
import com.abdullahssonmez.dto.DtoAddressIU;

public interface IRestAddressController {

	public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
}
