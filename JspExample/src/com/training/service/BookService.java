package com.training.service;

import java.util.*;

import com.training.entity.Book;

public class BookService {

	private List<Book> bookList;

	public BookService() {
		super();
        this.bookList=new ArrayList<>();
	}
	public boolean addBook(Book book)
	{
		return this.bookList.add(book);
	}
	public List<Book> getAllbooks()
	{
		return this.bookList;
	}
	
}
