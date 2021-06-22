package com.training.services;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import com.training.models.Edibles;
import com.training.models.Electronics;
import com.training.models.Garments;
import com.training.models.Product;
import com.training.utils.ConnectionUtils;

public class ProductServices {

	private LocalDate date;
	
	private Product[] garments;
	private Product[] edibles;
	private Product[] electronics;
	
	private Connection connection;
	
	private SqlRetailServices service;
	
	private int edibleIdx;
	private int garmentIdx;
	private int electronicsIdx;
	

	public ProductServices(String date) {
		super();
		this.date =  LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-LL-yyyy"));
		this.edibles = new Edibles[10];
		this.edibleIdx=0;
		this.garments = new Garments[10];
		this.garmentIdx=0;
		this.electronics = new Electronics[10];
		this.electronicsIdx=0;
		
		this.connection=ConnectionUtils.getMySqlConnection();
		this.service  = new SqlRetailServices(connection);

	}
	
	public ProductServices() {
		super();
		this.connection=ConnectionUtils.getMySqlConnection();
		this.service  = new SqlRetailServices(connection);

	}


	public String getDate() {
		return date.toString();
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public void addEdible(int itemCode, String itemName, double unitPrice, int quantity, String dateOfManufacture,
			String dateOfExpiry, String typeOfFood) {
		
		
		edibles[edibleIdx++] = new Edibles(itemCode, itemName, unitPrice, quantity, dateOfManufacture, dateOfExpiry, typeOfFood);
		service.add(edibles[edibleIdx-1], date.toString());
	}
	
	public void addGarments(int itemCode, String itemName, double unitPrice, int quantity, String size, String material) {
		
		garments[garmentIdx++]= new Garments(itemCode, itemName, unitPrice, quantity, size, material);
		service.add(garments[garmentIdx-1], date.toString());

	}
	
	public void addElectronics(int itemCode, String itemName, double unitPrice, int quantity, String size, int warrenty,
			double electricityWattage) {
		
		
		electronics[electronicsIdx++] = new Electronics(itemCode, itemName, unitPrice, quantity, size, warrenty, electricityWattage);
		service.add(electronics[electronicsIdx-1], date.toString());		//System.out.println("Electronics -- " + itemName +" Added");

	}
	
	private void printInTable(Product[] subProd) {
		double total;

		total=0;
		System.out.println("===================================================");
		System.out.println("S.No   Items Name   Unit Price   Quantity   Amount");
		System.out.println("---------------------------------------------------");
		for(int i=0;i<subProd.length;i++){
			if(subProd[i]!=null) {
				System.out.println(i+1 +"      "+ subProd[i]);
				total=total+subProd[i].getAmount();

			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Total :  "+ total);
		System.out.println("===================================================");
		System.out.println("");
	}
	
	public void printReportByDay(String category) {
		
		
		switch(category) {
		case "Edibles":
		
			System.out.println("Edibles Items Report for "+ date.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy")));
			printInTable(edibles);
			System.out.println("");
			break;
			
			
		case "Garments":
			
			System.out.println("Garments Items Report for "+ date.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy")));
			printInTable(garments);
			System.out.println("");
			break;
			
			
		case "Electronics":

			System.out.println("Electronics Items Report for "+ date.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy")));
			printInTable(electronics);
			System.out.println("");
			break;
		}
	}
	
	private void printInTableTopSelling(String category, int month) {
		
		System.out.println("================================");
		System.out.println("S.No.    Item Names    Quantity");
		System.out.println("--------------------------------");
		service.findAllTopSelling(category,month);
		System.out.println("================================");
		
	}
	
	public void printTopSelling(String category, int month) {
		
		switch(category) {
		case "Edibles":
		
			System.out.println("Top Selling Edibles for "+ Month.of(month) + " " + LocalDate.now().getYear());
			printInTableTopSelling("Edible",month);
			System.out.println("");
			break;
			
			
		case "Garments":
			
			System.out.println("Top Selling Garments for "+  Month.of(month) + " " + LocalDate.now().getYear());
			printInTableTopSelling("Garments",month);
			System.out.println("");
			break;
			
			
		case "Electronics":

			System.out.println("Top Selling Electronics for "+  Month.of(month) + " " + LocalDate.now().getYear());
			printInTableTopSelling("Electronics",month);
			System.out.println("");
			break;
		}
	}
}
