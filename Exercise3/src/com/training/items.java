package com.training;

public class items {
      private String itemName;
      private double itemprice;
	  private int itemQuantity;
	public items() {
		super();
	}
	public items(String itemName, double itemprice, int itemQuantity) {
		super();
		this.itemName = itemName;
		this.itemprice = itemprice;
		this.itemQuantity = itemQuantity;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemprice() {
		return itemprice;
	}
	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	@Override
	public String toString() {
		return "items [itemName=" + itemName + ", itemprice=" + itemprice + ", itemQuantity=" + itemQuantity + "]";
	}
	
	 
    
}
