package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@Service
public class InvokeTripDetails {

	@Autowired
	private RestTemplate template;
	
	@HystrixCommand(fallbackMethod = "tripDetailsFallBack",
			commandProperties =
			{ @HystrixProperty(name ="execution.isolation.thread.timeoutInMilliseconds",value = "2000")} )
	public String getTripDetails(String name) {
		String url="http://TRIP-DETAILS-SERVICE/api/v1/trips/"+name;
		String data=template.getForObject(url,String.class);
				return data;
	}
	public String tripDetailsFallBack(String name) {
		String data="{'id':000,'tripDate':'0000-00-00','customerName':'guest','amount':0}";
		return data;
	}
}
