package com.training;


import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.training.model.Invoice;
import com.training.services.Constant;
import com.training.services.InvoiceService;

public class Application {
	
	public static void print(List<Invoice> invList)
	{
		Iterator<Invoice> itr=invList.iterator();
        while(itr.hasNext())
        {
        	Invoice inv=itr.next();
        	System.out.println(inv);
        }
	}

	public static void main(String[] args) {

		Invoice inv1=new Invoice(101,"ram",67);
		Invoice inv2=new Invoice(102,"bam",60);
		Invoice inv3=new Invoice(103,"mam",70);
		Invoice inv4=new Invoice(103,"mam",70);
		System.out.println("Is equal:  "+inv3.equals(inv4));

		InvoiceService service=new InvoiceService();
		
		service.add(inv1);
		service.add(inv2);
        service.add(inv3);

        List<Invoice> list=service.findAll();
        print(list);
        System.out.println("===========================");
        
        System.out.println("Sorted by name");
        List<Invoice> list1=service.getSortedListBy(Constant.CUSTOMERNAME);
        print(list1);
        System.out.println("===========================");
        
        System.out.println("Sorted by Invoice Number");
        List<Invoice> list2=service.getSortedListBy(Constant.INVOICENUMBER);
        print(list2);
        System.out.println("===========================");
        
        System.out.println("Sorted by Amount");
        List<Invoice> list3=service.getSortedListBy(Constant.AMOUNT);
        print(list3);
        System.out.println("===========================");
        
//        List<String> names=Arrays.asList("ramesh","anand","magesh","yash","shiv");
//        Collections.sort(names);
//        System.out.println(names);
	}

}
