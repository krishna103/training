package com.training.models;

import com.training.ifaces.Converter;

public class CurrencyConvertor implements Converter {

	private double indianRupee;
	
	public CurrencyConvertor() {
		super();
	}
	

	public CurrencyConvertor(double indianRupee) {
		super();
		this.indianRupee = indianRupee;
	}
    

	public double getIndianRupee() {
		return indianRupee;
	}


	public void setIndianRupee(double indianRupee) {
		this.indianRupee = indianRupee;
	}


	@Override
	public double convert() {
		return this.indianRupee/74.00;
	}

}
