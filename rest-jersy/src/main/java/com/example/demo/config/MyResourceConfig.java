package com.example.demo.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.example.demo.CorsProvider;

@ApplicationPath("/rest/*")
public class MyResourceConfig extends ResourceConfig {

	public MyResourceConfig() {
		super();
        packages("com.example.demo");
        register(CorsProvider.class);
	}
  
}
