package com.abdullahssonmez.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullahssonmez.dto.DtoAddress;
import com.abdullahssonmez.dto.DtoCar;
import com.abdullahssonmez.dto.DtoGallerist;
import com.abdullahssonmez.dto.DtoGalleristCar;
import com.abdullahssonmez.dto.DtoGalleristCarIU;
import com.abdullahssonmez.exception.BaseException;
import com.abdullahssonmez.exception.ErrorMessage;
import com.abdullahssonmez.exception.MessageType;
import com.abdullahssonmez.model.Car;
import com.abdullahssonmez.model.Gallerist;
import com.abdullahssonmez.model.GalleristCar;
import com.abdullahssonmez.repository.CarRepository;
import com.abdullahssonmez.repository.GalleristCarRepository;
import com.abdullahssonmez.repository.GalleristRepository;
import com.abdullahssonmez.service.IGalleristCarService;

@Service
public class GalleristCarServiceImpl implements IGalleristCarService{
	
	@Autowired
	private GalleristCarRepository galleristCarRepository;
	
	@Autowired
	private GalleristRepository galleristRepository;

	@Autowired
	private CarRepository carRepository;
	
	private GalleristCar createGalleristCar(DtoGalleristCarIU dtoGalleristCarIU) {
		
		Optional<Gallerist> optGallerist = galleristRepository.findById(dtoGalleristCarIU.getGalleristId());
		if(optGallerist.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristCarIU.getGalleristId().toString()));
		}

		Optional<Car> optCar = carRepository.findById(dtoGalleristCarIU.getCarId());
		if(optCar.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristCarIU.getCarId().toString()));
		}
		
		
		GalleristCar galleristCar = new GalleristCar();
		galleristCar.setCreateTime(new Date());
		galleristCar.setGallerist(optGallerist.get());
		galleristCar.setCar(optCar.get());
		
		return galleristCar;
		
	}
	
	@Override
	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU) {
		DtoGalleristCar dtoGalleristCar = new DtoGalleristCar();
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoCar dtoCar = new DtoCar();
		
		DtoAddress dtoAddress = new DtoAddress();
		
		GalleristCar savedGalleristCar = galleristCarRepository.save(createGalleristCar(dtoGalleristCarIU));
		
		BeanUtils.copyProperties(savedGalleristCar, dtoGalleristCar);
		BeanUtils.copyProperties(savedGalleristCar.getGallerist(), dtoGallerist);
		BeanUtils.copyProperties(savedGalleristCar.getGallerist().getAddress(), dtoAddress);
		
		BeanUtils.copyProperties(savedGalleristCar.getCar(), dtoCar);
		
		
		dtoGallerist.setAddress(dtoAddress);
		dtoGalleristCar.setGallerist(dtoGallerist);
		dtoGalleristCar.setCar(dtoCar);
		
		return dtoGalleristCar;
	}

}
