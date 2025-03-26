package com.abdullahssonmez.service;

import com.abdullahssonmez.dto.DtoGalleristCar;
import com.abdullahssonmez.dto.DtoGalleristCarIU;

public interface IGalleristCarService {

	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
