package com.abdullahssonmez.controller;

import com.abdullahssonmez.dto.DtoGallerist;
import com.abdullahssonmez.dto.DtoGalleristIU;

public interface IRestGalleristController {

	public RootEntity<DtoGallerist> saveGallerist(DtoGalleristIU dtoGalleristIU);
}
