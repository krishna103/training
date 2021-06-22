package com.training;

import com.training.model.Invoice;
import com.training.utils.InvoiceComparators;

import java.util.*;

public class SetAndMap {
	// varargs 
    public static void createHashSet(Invoice ...invoices) {
    	HashSet<Invoice> invoiceSet=new HashSet<>();
    	for(Invoice eachInvoice:invoices)
    	{
    		System.out.println(invoiceSet.add(eachInvoice));
    	}
    	print(invoiceSet);
    	
    }
    
    public static void createTreeSet(Invoice ...invoices) {
    	//TreeSet<Invoice> treeSet=new TreeSet<>();
    	InvoiceComparators comparators=new InvoiceComparators();
    	TreeSet<Invoice> treeSet= new TreeSet<Invoice>(comparators.new InvoiceAmountComparator());
    	for(Invoice eachInvoice:invoices)
    	{
    		System.out.println(treeSet.add(eachInvoice));
    	}
    	print(treeSet);
    }
    public static void print(Set<Invoice> collection)
    {
    	for(Invoice eachInvoice:collection)
    	{
    		System.out.println(eachInvoice);
    	}
    }
    public static void print(Map<String,Invoice> collection)
    {
    	Set<Map.Entry<String,Invoice>> set=collection.entrySet();
    	for(Map.Entry<String,Invoice> eachEntry:set)
    	{
    		System.out.println(eachEntry.getKey()+" : "+eachEntry.getValue());
    	}
    }
     public static void createHashMap(Invoice ...invoices) {
	       HashMap<String,Invoice> hm=new HashMap<String, Invoice>();
	       for(Invoice eachInvoice:invoices)
	       {
	    	   System.out.println(hm.put(eachInvoice.getCustomerName(), eachInvoice));
	       }
	       System.out.println(hm.get("ram"));
	       print(hm);
     }
	public static void main(String[] args) {
		Invoice inv1=new Invoice(101,"ram",67);
		Invoice inv2=new Invoice(102,"bam",60);
		Invoice inv3=new Invoice(103,"mam",70);
		Invoice inv4=new Invoice(103,"mam",70);
		//createHashSet(inv1,inv2,inv3,inv3);
         createTreeSet(inv1,inv2,inv3,inv4);
		//createHashMap(inv1,inv2,inv3,inv4);
	}

}
