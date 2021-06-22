package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.BloodDonorDetails;

@RestController
public class BloodDonorClientController {

	@Autowired
	private BloodDonorDetails service;
	
	@GetMapping(path = "/clients/{bloodGroup}")
	public String getDetails(@PathVariable("bloodGroup") String bloodGroup) {
		return this.service.getBloodDonorDetails(bloodGroup);
	}
}
