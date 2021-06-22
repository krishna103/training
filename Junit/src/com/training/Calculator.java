package com.training;

import java.util.List;
import java.util.Arrays;

public class Calculator {
	
     public double calculate(String...values) throws NumberFormatException,ArrayIndexOutOfBoundsException {
    	    double result=0;
			int number=Integer.parseInt(values[1]);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			result=number*10;
    	    return result;
     }
     public String getNameFromString(int idxpos)
     {
    	 List<String> nameList=Arrays.asList("Ganesh",null,"Suresh",null,"Manish","Aman");
    	 return nameList.get(idxpos);
     }
}
