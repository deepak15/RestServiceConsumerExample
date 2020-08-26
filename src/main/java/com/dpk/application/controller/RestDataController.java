package com.dpk.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dpk.application.service.PoemService;

@RestController
public class RestDataController {

	@Autowired
	private PoemService poemService;
	
	
	@GetMapping("/poem")
	public String getPoemOfTheDay() {
		return poemService.getPoem();
		
	}
}
