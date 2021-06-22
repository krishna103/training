package com.training.services;
import com.training.ifaces.Converter;
import com.training.models.TemperatureConvertor;
import com.training.models.CurrencyConvertor;

public class ConvertorService {
	
    public void print(Converter poly)
    {
    	System.out.println(poly.convert());
    }
    public Converter getReference(int key)
    {
    	switch(key) {
    	case 1:
    		return new CurrencyConvertor();
    	case 2:
    		return new TemperatureConvertor();
    	default:
    		return null;
    	}
    }
}
