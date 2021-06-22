package com.example.demo.ifaces;

import java.util.List;

public interface DataAccess<T> {

	public int add(T t);
	public List<T> findAll();
}
