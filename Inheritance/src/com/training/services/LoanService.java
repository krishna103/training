package com.training.services;

import com.training.model.Loan ;

public class LoanService {
	public String doxRequired() {
		return "Pancard,DL,SalarySlip";
	}
	public Loan getLoan(int key) {
		if (key==1) {
			return new Loan();
		} else {
			return null;
		}
		
	}
}
