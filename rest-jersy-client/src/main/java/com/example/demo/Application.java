package com.example.demo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class Application {

	public static void main(String[] args) {
		Client builder=ClientBuilder.newClient();
		WebTarget target=
				builder.target("http://localhost:8080/rest-jersy/rest/invoices");
		String response=target.request().get(String.class);
		System.out.println(response);
	}

}
