package com.abdullahssonmez.controller;

import com.abdullahssonmez.dto.DtoGalleristCar;
import com.abdullahssonmez.dto.DtoGalleristCarIU;

public interface IRestGalleristCarController {

	public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
