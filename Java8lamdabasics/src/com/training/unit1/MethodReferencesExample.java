package com.training.unit1;

public class MethodReferencesExample {

	public static void main(String[] args) {
		//Thread t1=new Thread(()->printMessage());
		Thread t1=new Thread(MethodReferencesExample::printMessage);
		t1.start();
	}
	public static void printMessage() {
		System.out.println("Hello");
	}
}
