package com.example.entity;

public class Store {
	private String storeName;
	private String location;
	private int phoneNumber;
	public Store() {
		super();
	}
	public Store(String storeName, String location, int phoneNumber) {
		super();
		this.storeName = storeName;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}
	public String getStoreName() {
		System.out.println("calling for store name");
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getLocation() {
		System.out.println("calling for location");

		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPhoneNumber() {
		System.out.println("calling for phone number");

		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", location=" + location + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
