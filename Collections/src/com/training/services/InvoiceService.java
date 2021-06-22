package com.training.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.ifaces.DataAccess;
import com.training.model.Invoice;
import com.training.utils.InvoiceComparators;

public class InvoiceService implements DataAccess<Invoice> {

	private List<Invoice> invoiceList;
	
	public InvoiceService() {
		super();
		this.invoiceList=new ArrayList<>();
	}
    
	public InvoiceService(List<Invoice> invoiceList) {
		super();
		this.invoiceList = invoiceList;
	}

	@Override
	public boolean add(Invoice t) {
        
		return this.invoiceList.add(t);
	}

	@Override
	public List<Invoice> findAll() {
		return this.invoiceList;
	}

	@Override
	public boolean remove(Invoice t) {
		return this.invoiceList.remove(t);
	}

	@Override
	public List<Invoice> getSortedListBy(String field) {
		InvoiceComparators comprators=new InvoiceComparators();
		switch(field) {
		case Constant.CUSTOMERNAME:
			Collections.sort(this.invoiceList);
			break;
		case Constant.INVOICENUMBER:
			Collections.sort(this.invoiceList,comprators.new InvoiceNumberComparator());
			break;
		case Constant.AMOUNT:
			Collections.sort(this.invoiceList,comprators.new InvoiceAmountComparator());
			break;
		default:
			break;
	}
		return this.invoiceList;
	}
      
}
