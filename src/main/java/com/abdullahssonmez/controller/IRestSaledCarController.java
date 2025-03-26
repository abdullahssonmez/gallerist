package com.abdullahssonmez.controller;

import com.abdullahssonmez.dto.DtoSaledCar;
import com.abdullahssonmez.dto.DtoSaledCarIU;

public interface IRestSaledCarController {

	public RootEntity<DtoSaledCar> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
