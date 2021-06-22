package com.training.services;

public class NumberService {

	public NumberService() {
		super();
	}
	public void sumNumbers(int upto)
	{
		int count=0;
		for(int i=0;i<=upto;++i)
		{
			count=count+i;
		}
		System.out.println("Name of the Executing Thread is : "+Thread.currentThread().getName());
		System.out.println("Count upto"+upto+" =="+count);
	}
     
}
