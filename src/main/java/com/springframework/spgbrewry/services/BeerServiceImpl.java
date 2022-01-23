package com.springframework.spgbrewry.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springframework.spgbrewry.web.model.BeerDto;
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerByID(int beerId) {
		return BeerDto.builder().id(99).beerName("GalaxyCat").beerStyle("Pale Alpine").upc(77L).build();
	}

	
	
}
