package com.aurionpro.model;

import java.io.IOException;
import java.util.Vector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletToJSP extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Communicating a simple String message.
        String message = "Example source code of Servlet to JSP communication.";
        request.setAttribute("message", message);

        // Communicating a Vector object
        Vector<String> vecObj = new Vector<>();
        vecObj.add("Servlet to JSP communicating an object");
        request.setAttribute("vecBean", vecObj);

        // Forward request to JSP
        RequestDispatcher reqDispatcher = request.getRequestDispatcher("/jsp/javaPapers.jsp");
        reqDispatcher.forward(request, response);
    }
}
