package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TripData;
import com.example.demo.ifaces.TripDataRepository;

@Service
public class TripDataService {

	@Autowired
	private TripDataRepository repo;
	
	public List<TripData> findAll(){
		return this.repo.findAll();
	}
	public List<TripData> findTripsByCustomerName(String name){
		if(name.equals("ram"))
		{
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return this.repo.findByCustomerName(name);
	}
	public List<TripData> findTripsByCustomerNameAndDate(String customerName,LocalDate date){
		return this.repo.findByCustomerNameAndTripDate(customerName, date);
	}
}
