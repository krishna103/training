package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Circle {

	private String name="Circle Name";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
