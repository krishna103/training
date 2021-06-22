package com.example.demo.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TripData;
import com.example.demo.services.TripDataService;

@RestController
@CrossOrigin(origins = "*")
public class TripDataController {

	@Autowired
	private TripDataService service;
	@GetMapping(path = "api/v1/trips")
	public List<TripData> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/api/v1/trips/{name}")
	public List<TripData> findTripsByCustomerName(@PathVariable("name") String name){
		
		return this.service.findTripsByCustomerName(name);
	}
	
	@GetMapping(path = "api/v1/trips/{name}/{date}")
	public List<TripData> findTripsByCustomerNameAndDate(@PathVariable("name") String customerName, @PathVariable("date") LocalDate date){
		return this.service.findTripsByCustomerNameAndDate(customerName, date);
	}
}
