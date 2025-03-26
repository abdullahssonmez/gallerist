package com.abdullahssonmez.controller;

import com.abdullahssonmez.dto.DtoCar;
import com.abdullahssonmez.dto.DtoCarIU;

public interface IRestCarController {

	public RootEntity<DtoCar> saveCar(DtoCarIU dtoCarIU);
}
