package com.training.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Book;
import com.training.service.BookService;

/**
 * Servlet implementation class BookServlets
 */
@WebServlet("/bookServlets")
public class BookServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private BookService service;
    public BookServlets() {
        super();
        service=new BookService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> bookList=service.getAllbooks();
		request.setAttribute("bookList",bookList);

		RequestDispatcher dispatcher=request.getRequestDispatcher("/showBooks.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strBookNumber=request.getParameter("bookNumber");
		int bookNumber=Integer.parseInt(strBookNumber);
		String bookName=request.getParameter("bookName");
		String author=request.getParameter("author");
		String[] category=request.getParameterValues("category");
		Book book = new Book(bookNumber, bookName, author, category);
		boolean result=service.addBook(book);
		String message="book not added - Check exceptions";
		if(result) {
			message="one book added";
		}
		
		request.setAttribute("message",message);

		RequestDispatcher dispatcher=request.getRequestDispatcher("/addBook.jsp");
		dispatcher.forward(request, response);
	}

}
