package com.training.model;

import com.training.annotations.DataTable;
import com.training.annotations.Example;

@Example(value = "College Student")
@DataTable(tableName = "student_data")
public class Student {

	private int id;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
//	@DataTable(tableName = "student_data")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
