package com.training.ifaces;

import com.training.models.Product;

public interface DataAccess<T> {

	public boolean add(Product T,String date);
	public void findAllTopSelling(String category,int month);
}
