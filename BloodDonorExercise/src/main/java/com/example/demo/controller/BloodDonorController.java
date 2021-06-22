package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BloodDonor;
import com.example.demo.services.BloodDonorService;

@RestController
@CrossOrigin(value = "*")
public class BloodDonorController {

	@Autowired
	private BloodDonorService service;
	
	@GetMapping(path="/api/v1/donors/{bloodGroup}")
	public List<BloodDonor> findAllByBloodGroup(@PathVariable("bloodGroup") String bloodGroup){
		return service.findAllByBloodGroup(bloodGroup);
	}
	
	@GetMapping(path = "/api/v1/donors")
	public List<BloodDonor> findAll(){
		return service.findAll();
	}
}