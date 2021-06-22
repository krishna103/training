package com.example.demo;

import java.util.List;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Calculator {
	
	 Logger log= Logger.getLogger(this.getClass().getName());
     public double calculate(String...values) throws NumberFormatException,ArrayIndexOutOfBoundsException {
    	 double result=0;
			int number=Integer.parseInt(values[1]);
			log.info("value entered is "+number);
			if(number<0)
			{
				log.error("invalid number - should be a positive number");
			}
			try {
				log.debug("going to sleep");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				log.debug("catch block interrrupted exception");
				e.printStackTrace();
			}
			result=number*10;
			log.info("complete calculate method");
    	 return result;
     }
     
     public String getNameFromString(int idxpos)
     {
    	 List<String> nameList=Arrays.asList("Ganesh",null,"Suresh",null,"Manish","Aman");
    	 return nameList.get(idxpos);
     }
}
