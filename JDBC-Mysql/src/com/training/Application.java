package com.training;


import java.util.Arrays;
import java.sql.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.training.model.Invoice;
//import com.training.services.Constant;
import com.training.services.InvoiceService;
import com.training.utils.ConnectionUtils;

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

//		Invoice inv1=new Invoice(110,"zam",67);
//		Invoice inv2=new Invoice(112,"bam",60);
//		Invoice inv3=new Invoice(114,"mam",70);
		//Invoice inv4=new Invoice(103,"mam",70);
		//System.out.println("Is equal:  "+inv3.equals(inv4));

		Connection connection = ConnectionUtils.getMySqlConnection();
		
		InvoiceService service=new InvoiceService(connection);
		System.out.println(connection);
		
//		System.out.println(service.add(inv1));
//		System.out.println(service.add(inv2));
//        System.out.println(service.add(inv3));
        //service.closeConnection();
        //	List<Invoice> resultList=service.findAll();
//         	Iterator<Invoice> iterator=resultList.iterator();
//		System.out.println("List before sort ---------");
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
//		System.out.println(service.remove(inv3));
//        System.out.println("List after deleting inv3");
//        List<Invoice> resultList1=service.findAll();
//     	Iterator<Invoice> iterator1=resultList1.iterator();
//     	while(iterator1.hasNext())
//	    {
//		    System.out.println(iterator1.next());
//	    }
//        List<Invoice> list=service.findAll();
//        
//        System.out.println("Sorted by name");
//        List<Invoice> list1=service.getSortedListBy(Constant.CUSTOMERNAME);
//        print(list1);
//        System.out.println("===========================");
//        
//        System.out.println("Sorted by Invoice Number");
//        List<Invoice> list2=service.getSortedListBy(Constant.INVOICENUMBER);
//        print(list2);
//        System.out.println("===========================");
//        
//        System.out.println("Sorted by Amount");
//        List<Invoice> list3=service.getSortedListBy(Constant.AMOUNT);
//        print(list3);
//        System.out.println("===========================");
        
//        List<String> names=Arrays.asList("ramesh","anand","magesh","yash","shiv");
//        Collections.sort(names);
//        System.out.println(names);
	}

}
