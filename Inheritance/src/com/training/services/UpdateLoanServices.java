package com.training.services;

import com.training.HousingLoan;
import com.training.model.Loan;

public class UpdateLoanServices extends LoanService {

	@Override
	public Loan getLoan(int key) {
		// TODO Auto-generated method stub
		if (key==2) {
			return new HousingLoan(900, "ramesh", 670, "ing", "non-metro");
			
		}else {
		return super.getLoan(key);}
	}

}
