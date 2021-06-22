package com.training.services;

import com.training.ifaces.Converter;

public class FunctionalJava {

	public double useConverter(Converter<Double,Double> conv,double value)
	{
		return conv.convert(value);
	}
}
