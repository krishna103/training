package com.example.demo;

public class UsingFinallyBlock {
      public static String getMessage(String name)
      {
    	  int length=0;
    	  try {
    	   length=name.length();
    	  }catch(NullPointerException e)
    	  {
    		  System.err.println("error ");
    		  return "Returning from catch";
    	  }
    	  finally {
    		  System.out.println("Inside Finally");
    	  }
    	  System.out.println("After try catch block");
    	  return "length of string "+ length;
      }
}
