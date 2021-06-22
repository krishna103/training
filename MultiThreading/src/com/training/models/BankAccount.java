package com.training.models;

public class BankAccount {
      private double balance;
      
      public BankAccount() {
		super();
        this.balance=3000;
      }
	public synchronized double deposit(double amount)
      {
		  notifyAll();
    	  return this.balance+=amount;
      }
      public synchronized double withdraw(double amount)
      {
    	  if(this.balance<amount)
    	  {
    		  System.out.println("Insufficient balance");
    		  try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
    	  }
    	      System.out.println("Withdrawing amount");
    		  this.balance=this.balance-amount;
    	  return this.balance;
      }
}
