package com.springframework.spgbrewry.web.controller;

import java.util.UUID;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.spgbrewry.services.BeerService;
import com.springframework.spgbrewry.web.model.BeerDto;

@RequestMapping("/api/beer")
@RestController
public class BeerController {

	private final BeerService beerService;
	
	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable int beerId){
		return new ResponseEntity<>(beerService.getBeerByID(beerId),HttpStatus.OK);
		
	}
	
}
