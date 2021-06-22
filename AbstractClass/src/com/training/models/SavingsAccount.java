package com.training.models;

public class SavingsAccount extends BankAccount {

	private String nominee;
	
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String nominee) {
		super(accountNumber, accountHolderName, balance);
		this.nominee = nominee;
	}
	
	
	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	@Override
	public double deposit(double amount) {
		
		double balance=this.getBalance()+amount;
		this.setBalance(balance);
		return balance;
	}

	@Override
	public double withdraw(double amount) {
		
		double currentBalance=this.getBalance();
		if(currentBalance-amount>1000) {
			currentBalance =this.getBalance()-amount;
			this.setBalance(currentBalance);
		}else
		{
			System.out.println("Insufficient Balance");
		}
		return currentBalance;
	}

	

}
