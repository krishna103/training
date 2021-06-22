package com.training.models;

public class ThreadCommunication {

	public static void main(String[] args) {
		BankAccount a1=new BankAccount();
			
        Thread t1=new Thread() {
        	public void run()
        	{
        	    a1.withdraw(6000);
        		System.out.println("Amount Withdrawn");
        	}
        };
        t1.start();
        
	  Thread t2=new Thread(){
    	public void run()
    	{
    		a1.deposit(4000);
    		System.out.println("amount deposit");
    	}
    };
    t2.start();
}

};
