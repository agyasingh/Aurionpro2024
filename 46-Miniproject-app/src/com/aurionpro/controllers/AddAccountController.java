package com.aurionpro.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.database.AccountDb;
import com.aurionpro.database.CustomerDb;
import com.aurionpro.entity.Account;
import com.aurionpro.entity.Customer;

/**
 * Servlet implementation class AddAccountController
 */
@WebServlet("/AddAccountController")
public class AddAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAccountController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	HttpSession session = request.getSession();
	        int customerId = Integer.parseInt(request.getParameter("customerId"));
	        String accountNumber = request.getParameter("accountNumber");
	        String accountType = request.getParameter("accountType");
	        double balance = Double.parseDouble(request.getParameter("balance"));
	        
	        Account account = new Account(customerId, accountNumber, accountType, balance);
	        AccountDb accountDb = new AccountDb();

	        try {
	            accountDb.addAccount(account);
	            
	           
	            session.setAttribute("accountNumber", accountNumber);
	            
	            request.setAttribute("message", "Account added successfully!");
	        } catch (SQLException e) {
	            request.setAttribute("message", "Failed to add account.");
	        }

	        request.getRequestDispatcher("AddAccount.jsp").forward(request, response);
	    }
	}



