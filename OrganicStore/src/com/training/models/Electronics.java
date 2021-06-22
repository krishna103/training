package com.training.models;

public class Electronics extends Product {

	private String size;
	private int warranty;
	private double wattage;
	
	public Electronics(int itemCode, String itemName, double unitPrice, int quantity, String size, int warranty,
			double wattage) {
		super(itemCode, itemName, unitPrice, quantity);
		this.size = size;
		this.warranty = warranty;
		this.wattage = wattage;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public double getWattage() {
		return wattage;
	}

	public void setWattage(double wattage) {
		this.wattage = wattage;
	}
	
}
