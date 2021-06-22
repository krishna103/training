package com.training.models;

import com.training.ifaces.Converter;

public class TemperatureConvertor implements Converter {

	private double celsius;
	
	public TemperatureConvertor() {
		super();
	}
	

	public TemperatureConvertor(double celsius) {
		super();
		this.celsius = celsius;
	}
    

	public double getCelsius() {
		return celsius;
	}


	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}


	@Override
	public double convert() {
		return (this.celsius*1.8)+32;
	}

}
