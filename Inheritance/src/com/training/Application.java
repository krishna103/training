package com.training;

import com.training.model.*;
import com.training.services.*;

public class Application  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan1 = new HousingLoan(102,"Ramesh",670,"apartments","metro");
		System.out.println(loan1.findRateOfInterest());
		
		Loan loan2 = new Loan(103,"Ramesh",570);
		System.out.println(loan2.findRateOfInterest());
		
		Loan loan3 = new Loan(104,"Ramesh",770);
		System.out.println(loan3.findRateOfInterest());
		
		LoanService service = new LoanService();
		System.out.println(service.getLoan(1));
		
		LoanService updateService = new UpdateLoanServices();
		System.out.println(updateService.getLoan(2));
		 
		Loan r1 =new Loan(106,"av",567);
		System.out.println(r1);
		
		
	}
	
	
	

}
