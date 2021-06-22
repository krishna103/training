package com.training;

public class Computer extends items implements RenInt {

	private String specs;
	
	public Computer() {
		super();
	}

	public Computer(String itemName, double itemprice, int itemQuantity, String specs) {
		super(itemName, itemprice, itemQuantity);
		this.specs = specs;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	@Override
	public double calculatePrice() {
		return this.getItemprice()*this.getItemQuantity();
	}

	@Override
	public String getCategory() {
		return this.getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return "Category: "+this.getCategory()+" Name: "+this.getItemName()+" Price: "+this.getItemprice()+" Quantity: "+this.getItemQuantity();
	}

}
