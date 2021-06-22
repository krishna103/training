package com.example.demo;

public class CreditCard {
	private int cardNumber;
	private String cardHolderName;
	private double creditLimit;
	public CreditCard() {
		super();
	}
	public CreditCard(int cardNumber, String cardHolderName, double creditLimit) throws Exception {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		if (creditLimit<=0) {
			throw new Exception("ERR-2949 provide Positive value");
		}else {
		this.creditLimit = creditLimit;}	
		}
	
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) throws Exception {
		if (creditLimit<=0) {
			throw new Exception("ERR-2949 provide Positive value");
		}else {
		this.creditLimit = creditLimit;}
	}
	

}
