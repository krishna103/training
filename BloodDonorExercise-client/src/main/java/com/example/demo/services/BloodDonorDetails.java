package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BloodDonorDetails {

	@Autowired 
	private RestTemplate template;
	
	public String getBloodDonorDetails(String name) {
		String url="http://BLOODDONOR-DETAIL-SERVICE/api/v1/donors/"+name;
		String data=template.getForObject(url, String.class);
		return data;
	}
}
