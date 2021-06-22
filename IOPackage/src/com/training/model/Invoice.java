package com.training.model;

import java.io.Serializable;

public class Invoice implements Serializable {
	
	  private static final long serialVersionUID = 104L;
	  private int invoiceNumber; 
	  private String customerName; 
	  private /*transient*/ double amount; 
		
		/*
		 * private String address;
		 
		 * public String getAddress() { return address; } public void setAddress(String
		 * address) { this.address = address; }
		 */
		 
	  
	public Invoice() {
		super();
	}
	public Invoice(int invoiceNumber, String customerName, double amount) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.amount = amount;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return this.invoiceNumber+","+this.customerName+","+this.amount;
	}
    
}
