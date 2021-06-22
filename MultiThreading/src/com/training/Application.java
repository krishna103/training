package com.training;

import com.training.ifaces.Display;
import com.training.services.UseNumberService;
import com.training.utils.Counter;

public class Application {

	public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Counter count1=new Counter();
        Thread t1=new Thread(count1,"csk");
        t1.start();
        Thread t2=new Thread(count1,"rcb");
        t2.start();
        
        
        
        try {
        	new UseNumberService(10,"TenCount");
			Thread.sleep(3000);
			new UseNumberService(100,"HundredCount");
	        new UseNumberService(1000,"ThousandCount");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        Display obj=new Display() {

			@Override
			public String showMessage() {
				return "Hello Delhi";
			}
        	
        };
        
        Display obj2=new Display() {

			@Override
			public String showMessage() {
				// TODO Auto-generated method stub
				return "Hello Chennai";
			}
        	
        };

        
	}

}
