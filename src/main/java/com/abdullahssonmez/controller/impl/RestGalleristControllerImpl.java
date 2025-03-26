package com.abdullahssonmez.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullahssonmez.controller.IRestGalleristController;
import com.abdullahssonmez.controller.RestBaseController;
import com.abdullahssonmez.controller.RootEntity;
import com.abdullahssonmez.dto.DtoGallerist;
import com.abdullahssonmez.dto.DtoGalleristIU;
import com.abdullahssonmez.service.IGalleristService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/gallerist")
public class RestGalleristControllerImpl extends RestBaseController implements IRestGalleristController{

	@Autowired
	private IGalleristService galleristService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoGallerist> saveGallerist(@Valid @RequestBody DtoGalleristIU dtoGalleristIU) {
		return ok(galleristService.saveGallerist(dtoGalleristIU));
	}

}
