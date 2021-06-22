package com.training;

import com.training.model.Invoice;
import com.training.service.InvoiceService;
import java.io.*;

public class Application {

	public static void main(String[] args) {
         File file =new File("invoice.ser");
         InvoiceService service=new InvoiceService(file);
         
         File textFile=new File("invoice.txt");
         InvoiceService txtService=new InvoiceService(textFile);
         
         int key=4;
         if(key==1) {
         Invoice ram = new Invoice(101,"ramesh",4500);
         boolean result=service.writeToFile(ram);
         if(result)
         {
        	 System.out.println("One object Persisted");
         }
         }
         if(key==2)
         {
        	 Invoice inv=service.readToFile();
        	 System.out.println(inv);
         }
         if(key==3)
         {
        	 Invoice[] invList= {
        			 new Invoice(101, "Ramesh",1000),
        			 new Invoice(102, "yamesh",2000),
        			 new Invoice(103, "Samesh",3000)
        	 };
        	 for(Invoice eachInvoice:invList)
        	 {
        		 boolean result=txtService.writeToTextFile(eachInvoice);
        		 System.out.println(result);
        	 }
         }
         if(key==4)
         {
        	 Invoice[] list=txtService.readFromTextFile();
        	 for(Invoice eachInvoice:list)
        	 {
        		 if(eachInvoice!=null) {
        		       System.out.println(eachInvoice);
        		 }
        	 }
         }
	}

}
