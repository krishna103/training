package com.example.services;
import java.util.*;

import com.training.model.Invoice;

public class InvoiceService {
    private Map<Integer,Invoice> invoiceList;

	public InvoiceService() {
		super();
		
        invoiceList=new HashMap<Integer,Invoice>();
        invoiceList.put(1919,new Invoice(1919,"Ramesh",4500));
        invoiceList.put(2000,new Invoice(2000,"Ram",5500));

	}
	public Invoice add(Invoice inv)
	{
		Invoice addedElement=null;
		
		Invoice added= invoiceList.put(inv.getInvoiceNumber(), inv);
		if(added==null)
		{
			addedElement=inv;
		}
		return addedElement;
	}
	public Invoice findById(int key)
	{
		return invoiceList.get(key);
	}
	public Map<Integer,Invoice> findAll()
	{
		return this.invoiceList;
	}
    public Invoice removeById(int key)
    {
    	Invoice remove=null;
    	Invoice inv=invoiceList.remove(key);
    	if(inv!=null)
    	{
    		remove=inv;
    	}
    	return remove;
    }
}
