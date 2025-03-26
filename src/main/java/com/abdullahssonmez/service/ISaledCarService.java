package com.abdullahssonmez.service;

import com.abdullahssonmez.dto.DtoSaledCar;
import com.abdullahssonmez.dto.DtoSaledCarIU;

public interface ISaledCarService {

	public DtoSaledCar buyCar(DtoSaledCarIU dtoSaledCarIU);
}
