package com.training;

public class RunnableExample {

	public static void main(String[] args) {

		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {

				System.out.println("printed inside runnable");
			}
		});
		t1.run();
		
		Thread t2=new Thread(()->System.out.println("printed inside runnable"));
		t2.run(); 
	}

}
