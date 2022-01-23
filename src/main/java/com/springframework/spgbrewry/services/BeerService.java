package com.springframework.spgbrewry.services;

import java.util.UUID;

import com.springframework.spgbrewry.web.model.BeerDto;

public interface BeerService {
	
	 BeerDto getBeerByID(int beerId);

}
