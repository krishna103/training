package com.training.model;

import java.io.Serializable;

public class Invoice implements Serializable,Comparable<Invoice> {
	
	  
	
	private static final long serialVersionUID = 104L;
	  private int invoiceNumber; 
	  private String customerName; 
	  private /*transient*/ double amount; 
		
		/*
		 * private String address;
		 * 
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
	@Override
	public int compareTo(Invoice obj) {
		return this.customerName.compareTo(obj.customerName);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + invoiceNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (invoiceNumber != other.invoiceNumber)
			return false;
		return true;
	}
}
