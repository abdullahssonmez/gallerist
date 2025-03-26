package com.abdullahssonmez.service;

import com.abdullahssonmez.dto.DtoGallerist;
import com.abdullahssonmez.dto.DtoGalleristIU;

public interface IGalleristService {

	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU);
}
