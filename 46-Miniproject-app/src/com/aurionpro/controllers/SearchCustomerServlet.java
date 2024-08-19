package com.aurionpro.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.database.CustomerDb;
import com.aurionpro.database.DbUtil;
import com.aurionpro.entity.Customer;

/**
 * Servlet implementation class SearchCustomerServlet
 */
@WebServlet("/SearchCustomerServlet")
public class SearchCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		String search = request.getParameter("search");
        String searchType = request.getParameter("searchType"); 
        
        CustomerDb customerDb = new CustomerDb();
        List<Customer> customers = null;

        if (search != null && !search.trim().isEmpty()) {
            switch (searchType) {
            
                case "allcustomers":
                    customers = customerDb.getAllCustomers(); 
                    break;
                case "firstName":
                    customers = customerDb.searchCustomerByFirstName(search.trim());
                    break;
                case "lastName":
                    customers = customerDb.searchCustomerByLastName(search.trim());
                    break;
                case "email":
                    customers = customerDb.searchCustomerByEmail(search.trim());
                    break;
                case "phone":
                    customers = customerDb.searchCustomerByPhone(search.trim());
                    break;
                
            }
        }

        request.setAttribute("customers", customers);
        request.getRequestDispatcher("ViewCustomers.jsp").forward(request, response);
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerId = request.getParameter("customerId");
        Customer customer = null;
        String message = "";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DbUtil.getConnection();
            String sql = "SELECT * FROM customers WHERE customer_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(customerId));
            rs = pstmt.executeQuery();

            if (rs.next()) {
                customer = new Customer();
                customer.setCustomerId(rs.getInt("customer_id"));
                customer.setFirstName(rs.getString("first_name"));
                customer.setLastName(rs.getString("last_name"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone(rs.getString("phone"));
                customer.setAddress(rs.getString("address"));
                request.setAttribute("customer", customer);
            } else {
                message = "Customer not found.";
                request.setAttribute("message", message);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            message = "An error occurred while searching for the customer.";
            request.setAttribute("message", message);
        } 

        // Forward the request to the appropriate JSP page
        request.getRequestDispatcher("AddAccount.jsp").forward(request, response);


		doGet(request, response);
		
		
	}

}
