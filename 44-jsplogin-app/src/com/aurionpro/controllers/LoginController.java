package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.model.DbUtil;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DbUtil dbUtil = null;

    public LoginController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = null;
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        dbUtil = new DbUtil();
        dbUtil.connectToDb();
        
        if (dbUtil.validateCredentials(username, password)) {
            request.setAttribute("username", username);
            requestDispatcher = request.getRequestDispatcher("LoginSuccess.jsp"); // Forward to success page
            requestDispatcher.forward(request, response);
        } else {
            requestDispatcher = request.getRequestDispatcher("LoginFailed.jsp"); // Forward to failure page
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
