package com.example.demo;

public class Book {
	 private int bookNumber;
	    public int getBookNumber() {
	        return bookNumber;
	    }
	    public void setBookNumber(int bookNumber) {
	        this.bookNumber = bookNumber;
	    }
	    private String bookName;
	    public String getBookName() {
	        return bookName;
	    }
	    public void setBookName(String bookName) {
	        this.bookName = bookName;
	    }
	    private Author author;
	    public Author getAuthor() {
	        return author;
	    }
	    public void setAuthor(Author author) {
	        this.author = author;
	    }
	    private double ratePerUnit;
	    public double getRatePerUnit() {
	        return ratePerUnit;
	    }
	    public void setRatePerUnit(double ratePerUnit) {
	        this.ratePerUnit = ratePerUnit;
	    }
	    public Book() {
	         super();
	        //this(0,"dummy","guest",0.0);
	        // TODO Auto-generated constructor stub
	    }
	    public Book(int bookNumber, String bookName, Author author, double ratePerUnit) {
	        super();
	        this.bookNumber = bookNumber;
	        this.bookName = bookName;
	        this.author = author;
	        this.ratePerUnit = ratePerUnit;
	        
	    }
}
