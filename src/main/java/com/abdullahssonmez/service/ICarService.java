package com.abdullahssonmez.service;

import com.abdullahssonmez.dto.DtoCar;
import com.abdullahssonmez.dto.DtoCarIU;

public interface ICarService {

	public DtoCar saveCar(DtoCarIU dtoCarIU);
}
