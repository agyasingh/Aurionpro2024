package com.aurionpro.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PasswordController
 */
@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 // Retrieve the session
        HttpSession session = request.getSession(false);

        // Check if session exists
        if (session != null) {
            // Get the username from the session
            String username = (String) session.getAttribute("username");
            String password = request.getParameter("password");

            // Display the username and password
            response.getWriter().print("Username: " + username + "<br>");
            response.getWriter().print("Password: " + password + "<br>");

            // Optionally, invalidate the session after use
            session.invalidate();
        } else {
            // If session does not exist, redirect or show an error message
            response.getWriter().print("No session found. Please log in first.");
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
