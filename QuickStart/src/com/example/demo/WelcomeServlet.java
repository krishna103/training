package com.example.demo;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.example.demo.services.HeadingService;
import com.example.entity.Store;
import com.mysql.cj.conf.ConnectionUrl;
import com.training.utils.ConnectionUtils;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private HeadingService service;
	private Connection connection;
    public WelcomeServlet() throws ClassNotFoundException {
        super();
        System.out.println("Servlet Initialised");
        connection=ConnectionUtils.getMySqlConnection();
        service = new HeadingService(connection);
    }
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println(request.getClass().getName());
//        System.out.println(response.getClass().getName());
//        
//        System.out.println(this);
//        System.out.println(Thread.currentThread().getId());
//
//		response.getWriter().append("<h1>welcome to Kirana Stores</h1> ");
		System.out.println(connection);
		String city=request.getParameter("city");
		

		
		Store heading = service.getHeading(city);
		
		request.setAttribute("heading", heading);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String storeName=request.getParameter("storeName");
		 String location=request.getParameter("location");
		 String strPhoneNumber=request.getParameter("phoneNumber");
		 int phoneNumber=Integer.parseInt(strPhoneNumber);
		 Store store=new Store(storeName,location,phoneNumber);
		 int rowAdded=service.add(store);
		 if(rowAdded==1) {
		 
			 request.setAttribute("heading",store);
			RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
			}
		 System.out.println(rowAdded);
	}


	@Override
	public void destroy() {
        try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
