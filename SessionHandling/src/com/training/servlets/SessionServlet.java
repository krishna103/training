package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SessionServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		System.out.println(session.isNew());
		System.out.println(session.getId());
		RequestDispatcher dispatcher = request.getRequestDispatcher("second.jsp");
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
		String userName=request.getParameter("userName");
        String passWord=request.getParameter("password");
        HttpSession session=request.getSession();
        RequestDispatcher dispatcher=null;
        if(userName.equals("india") && passWord.equals("india")) {
     	   session.setAttribute("isLogged",true);
     	   dispatcher = request.getRequestDispatcher("second.jsp");
        }
        else {
     	   request.setAttribute("errorMessage","Invalid user id and password");
     	   dispatcher=request.getRequestDispatcher("index.jsp");
        }
        dispatcher.forward(request, response);
	}

}
