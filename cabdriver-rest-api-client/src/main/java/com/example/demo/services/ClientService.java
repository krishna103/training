package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private LoadBalancerClient client;
	
	public String getDrivers() {
		//return this.template.getForObject("http://DRIVER-SERVICE/drivers", String.class);
	    ServiceInstance instance=client.choose("CABDRIVER-SERVICE");
	    String baseURL=instance.getUri().toString();
	    String url=baseURL+"/drivers/";
	    return this.template.getForObject(url, String.class);
	}
}
