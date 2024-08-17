package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.database.CustomerDb;
import com.aurionpro.database.DbConnection;


/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher requestDispatcher;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create the DbConnection and CustomerDb instances
        DbConnection dbConnection = new DbConnection();
        CustomerDb customerDb = new CustomerDb();
        
        // Connect to the bank database
        dbConnection.connectToBankDb();
        
        // Get parameters from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String role = request.getParameter("role");

        String redirectUrl = null;
        HttpSession session = request.getSession();

        if (role != null) {
            role = role.trim().toLowerCase(); // Ensure role is in lowercase for comparison
            if (role.equals("admin")) {
                // Validate admin credentials
                if (dbConnection.validateCredentials(username, password, role, email)) {
                    redirectUrl = "AdminHome.jsp";
                    session.setAttribute("adminName", username);
                    session.setAttribute("password", "password");
                    session.setAttribute("email", email);
                    session.setAttribute("adminRole", role);
                } else {
                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid admin credentials.");
                    return;
                }
            } 
            else if (role.equals("customer")) {
                // Validate customer credentials
                if (customerDb.validateCustomer(username, password, email)) {
                    redirectUrl = "CustomerHome.jsp";
                    session.setAttribute("username", username);
                    session.setAttribute("password",password);
                    session.setAttribute("email", email);
                    session.setAttribute("role", role);
                } else {
                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid customer credentials.");
                    return;
                }
            } else {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Unknown role.");
                return;
            }

            // Redirect to the appropriate home page if the credentials are valid
            if (redirectUrl != null) {
                response.sendRedirect(redirectUrl);
            }
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Role parameter is missing.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }


	
	
}
