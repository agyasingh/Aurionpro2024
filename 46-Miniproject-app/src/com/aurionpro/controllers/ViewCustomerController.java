package com.aurionpro.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.database.CustomerDb;
import com.aurionpro.database.DbUtil;
import com.aurionpro.entity.Customer;

/**
 * Servlet implementation class ViewCustomerController
 */
@WebServlet("/ViewCustomerController")
public class ViewCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDb customerDb = new CustomerDb();
	private List<Customer> customers;
	private RequestDispatcher dispatcher=null;
//	private DbUtil dbUtil=null;
//       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
         customers = customerDb.getAllCustomers();
        
//       
        request.setAttribute("customers", customers);
        dispatcher = request.getRequestDispatcher("ViewCustomers.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
