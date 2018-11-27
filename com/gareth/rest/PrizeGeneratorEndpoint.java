package com.gareth.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gareth.service.LengthCheckerService;

@RequestMapping("/prizegenerator")
@RestController

public class PrizeGeneratorEndpoint {

	@Autowired
	private LengthCheckerService service;

	public String checkPrize(String accountNumber) {
		return service.checkPrize(accountNumber);
	}

}
