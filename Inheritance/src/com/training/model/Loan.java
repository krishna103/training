package com.training.model;

public class Loan extends Object {
	private int loadId;
	private String applicantName;
	private int cibilScore;
	
	public int getLoadId() {
		return loadId;
	}

	public void setLoadId(int loadId) {
		this.loadId = loadId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(int loadId, String applicantName, int cibilScore) {
		super();
		this.loadId = loadId;
		this.applicantName = applicantName;
		this.cibilScore = cibilScore;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.applicantName +"  "+ this.cibilScore +"  "+ this.findRateOfInterest();
	}
	
	public double findRateOfInterest() {
		double interestRate = 7.5;
		if (cibilScore<600) {
			interestRate = 9.0;
				
		} else if(cibilScore>600 && cibilScore<=750) {
			interestRate = 8.0;	
		}
		return interestRate;
		
	}

	
	
	
}
