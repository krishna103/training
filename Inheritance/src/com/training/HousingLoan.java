package com.training;

import com.training.model.Loan;

public class HousingLoan extends Loan {
	private String housingType;
	private String location;
	
	public HousingLoan(int loadId, String applicantName, int cibilScore, String housingType, String location) {
		super(loadId, applicantName, cibilScore);
		this.housingType = housingType;
		this.location = location;
	}
	
	@Override
	public double findRateOfInterest() {
		double interestRate = 9.0;

		if ( location.equals("metro") &&  housingType.equals("apartments")){
				if (getCibilScore()<=650) 
				{ interestRate = 7.5;
				}else { interestRate = 6.2;}
			}	
		
		if ( location.equals("non-metro") && housingType.equals("individual")) {
			
				if (getCibilScore()<=650) 
				{ interestRate = 8.5;}
				else { interestRate = 7.4;}
			}	
		return interestRate;
		}
		
		
	
	public String getHousingType() {
		return this.housingType;
	}
	public void setHousingType(String housingType) {
		this.housingType = housingType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
