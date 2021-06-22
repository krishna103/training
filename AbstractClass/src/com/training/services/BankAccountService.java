package com.training.services;

import com.training.models.BankAccount;
import com.training.models.BusinessAccount;

public class BankAccountService {

	public static void main(String[] args) {
		
		/*
		 * BankAccount ramsAccount = new SavingsAccount(1000, "Ramesh", 1000, "Suresh");
		 * ramsAccount.deposit(1000); ramsAccount.deposit(2000);
		 * 
		 * System.out.println("Balance After Deposit "+ramsAccount.getBalance());
		 * 
		 * ramsAccount.withdraw(500); ramsAccount.withdraw(1500);
		 * 
		 * System.out.println("Balance After Withdraw "+ramsAccount.getBalance());
		 * 
		 * ramsAccount.withdraw(1500);
		 * 
		 * System.out.println("Withdraw beyond limit "+ramsAccount.getBalance());
		 */
		BankAccount SamsAccount = new BusinessAccount(1000, "Ramesh", 100000, "Suresh");
		SamsAccount.deposit(1000);
		System.out.println(SamsAccount.deposit(2000));
		
		System.out.println("Balance After Deposit "+SamsAccount.getBalance());
		
		SamsAccount.withdraw(500);
		SamsAccount.withdraw(1500);
		
		System.out.println("Balance After Withdraw "+SamsAccount.getBalance());
		
		SamsAccount.withdraw(1500);
		
		System.out.println("Withdraw beyond limit "+SamsAccount.getBalance());
	}

}
