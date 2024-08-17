package com.aurionpro.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
//		int number1=Integer.parseInt(request.getParameter("number1"));
//		int number2=Integer.parseInt(request.getParameter("number2"));
//		
//		writer.print("addition is " + (number1 + number2));
		
		
		String[] colours=request.getParameterValues("colours");
		
		if (colours != null) {
		    for (String value : colours) {
		        writer.print(value + " ");
		    }
		} else {
		    writer.print("No checkboxes selected.");
		}
		writer.print(colours);
		
		
		
		//writer.print("<b>Hello world|| Welcome to web world. </b>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
