package com.aurionpro.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.database.TransactionDb;
import com.aurionpro.entity.Transactions;

/**
 * Servlet implementation class ViewPassbookController
 */
@WebServlet("/ViewPassbookController")
public class ViewPassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ViewPassbookController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        TransactionDb transactionDb = new TransactionDb();
	        HttpSession session = request.getSession(false);
	        String email = (String) session.getAttribute("email");

	        if (email == null) {
	            response.sendRedirect("login.jsp");
	            return;
	        }

	        try {
	            List<Transactions> transactions = transactionDb.getTransactionDetailByEmail(email);
	            request.setAttribute("transactions", transactions);
	            request.getRequestDispatcher("ViewPassbook.jsp").forward(request, response);
	        } catch (Exception e) {
	            e.printStackTrace(); // Replace with proper logging and error handling
	            request.setAttribute("errorMessage", "An error occurred while retrieving transactions.");
	            request.getRequestDispatcher("errorPage.jsp").forward(request, response); // Forward to an error page if applicable
	        }
	    }

}
