package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.InvokeTripDetails;

@RestController
public class TripDetailClientController {

	@Autowired
	private InvokeTripDetails service;
	
	@GetMapping(path = "/clients/{name}")
	public String getDetails(@PathVariable("name") String name) {
		return this.service.getTripDetails(name);
	}
}
