package com.training.models;

public class BusinessAccount extends BankAccount {

	private String businessType;
	
	public BusinessAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public BusinessAccount(int accountNumber, String accountHolderName, double balance, String businessType) {
		super(accountNumber, accountHolderName, balance);
		this.businessType = businessType;
	}
	

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	@Override
	public double deposit(double amount) {
		double balance=this.getBalance();
		if(amount>=5000) {
		 balance=+amount;
		this.setBalance(balance);
		}else
		{
			System.out.println("low amount");
		}
		return balance;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		double currentBalance=this.getBalance();
		if(currentBalance-amount>10000) {
			currentBalance =this.getBalance()-amount;
			this.setBalance(currentBalance);
		}else
		{
			System.out.println("Insufficient Balance");
		}
		return currentBalance;
	}

}
