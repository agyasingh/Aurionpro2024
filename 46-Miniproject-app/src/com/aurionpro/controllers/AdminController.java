package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher dispatcher=null;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String action = request.getParameter("action");
		 
//		        if ("addBankAccounts".equals(action)) {
//	            // Forward the request to AddAccountController
//	            dispatcher = request.getRequestDispatcher("AddAccount.jsp");
//
//		        }
	          if ("addCustomer".equals(action)) {
	           
	            dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
	            dispatcher.forward(request, response);
	        } else if ("viewAccounts".equals(action)) {
	            
	            dispatcher = request.getRequestDispatcher("ViewAccountController");
	            dispatcher.forward(request, response);
	        } else if ("viewCustomers".equals(action)) {
	            
	            dispatcher = request.getRequestDispatcher("ViewCustomerController");
	            dispatcher.forward(request, response);
	        } else {
	            
	            dispatcher = request.getRequestDispatcher("AdminHome.jsp");
	            dispatcher.forward(request, response);
	        }
	    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
