package com.training.services;

public class UseNumberService implements Runnable {
    
	private int countTo;
	private String threadName;
	
	private NumberService service;
	
	public UseNumberService(int countTo, String threadName) {
		super();
		this.countTo = countTo;
		this.threadName = threadName;
		
		service = new NumberService();
		Thread t1=new Thread(this,threadName);
		t1.start();
	}

	@Override
	public void run() {
         service.sumNumbers(this.countTo);
         try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
         
	}

}
