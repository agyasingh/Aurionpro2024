package com.aurionpro.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.database.DbUtil;
import com.aurionpro.entity.Customer;

/**
 * Servlet implementation class UpdateProfile
 */
@WebServlet("/UpdateProfileServlet")
public class UpdateProfile extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProfile() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Retrieve customerId from session
        Integer customerId = (Integer) session.getAttribute("customerId");
        if (customerId == null) {
            response.sendRedirect("CustomerHome.jsp"); // Redirect if no customerId found
            return;
        }

        // Create a Customer object and populate it with the request parameters
        Customer customer = new Customer();
        
        customer.setFirstName(request.getParameter("name"));
       
        customer.setEmail(request.getParameter("email"));
        customer.setPassword(request.getParameter("password"));
      

        Connection conn = null;
        PreparedStatement pstmt = null;
        String message;

        try {
            conn = DbUtil.getConnection();
            String sql = "UPDATE customers SET name = ?, email = ?, password = ? WHERE customer_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, customer.getFirstName());
            pstmt.setString(2, customer.getLastName());
            pstmt.setString(3, customer.getEmail());
            pstmt.setString(4, customer.getPhone());
            pstmt.setString(5, customer.getAddress());
            pstmt.setInt(6, customer.getCustomerId()); // Use customerId from the Customer object

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                message = "Profile updated successfully!";
                // Update session attributes with new customer info if needed
                session.setAttribute("userName", customer.getFirstName() + " " + customer.getLastName());
                session.setAttribute("userEmail", customer.getEmail());
            } else {
                message = "Failed to update profile.";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            message = "An error occurred while updating the profile.";
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }

        // Set the message attribute to be displayed on the page
        request.setAttribute("message", message);
        // Forward the request back to the EditProfile.jsp
        request.getRequestDispatcher("EditProfile.jsp").forward(request, response);
    }
}
