<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.aurionpro.entity.Customer" import="com.aurionpro.database.CustomerDb" import="java.util.List" %>
<%@ include file="Navbar.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://cdn.tailwindcss.com"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
  
  <div class="flex flex-col">
  
  <div class="flex flex-col items-center justify-center p-4">
    <!-- Search Form -->
    <form action="SearchCustomerServlet" method="get" class="mb-4">
    <input type="text" name="search" class="border rounded py-2 px-4 w-64" /> <!-- Increased width -->
    <select name="searchType" class="border rounded py-2 px-4">
        <option value="allcustomers">All Customers</option>
        <option value="firstName">First Name</option>
        <option value="lastName">Last Name</option>
        <option value="email">Email</option>
        <option value="phone">Phone</option>
    </select>
    <button type="submit" class="bg-blue-500 text-white py-2 px-4 rounded">Search</button>
</form>

</div>
    
    <div class="overflow-x-auto sm:-mx-6 lg:-mx-8">
        <div class="py-2 inline-block min-w-full sm:px-6 lg:px-8">
            <div class="overflow-hidden">
                <table class="min-w-full">
                    <thead class="border-b">
                        <tr>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Customer ID</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">User ID</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">First Name</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Last Name</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Email</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Phone</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Address</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Password</th>
                        </tr>
                    </thead>
                    <tbody>
                   <%
                    // Retrieve the customer list from the request attribute
                    List<Customer> customers = (List<Customer>)request.getAttribute("customers");
                    if (customers != null && !customers.isEmpty()) {
                        for (Customer customer : customers) {
                %>
<tr class="border-t border-gray-200">
<td class="py-3 px-4"><%= customer.getCustomerId() %></td>
<td class="py-3 px-4"><%= customer.getUserId() %></td>
<td class="py-3 px-4"><%= customer.getFirstName() %></td>
<td class="py-3 px-4"><%= customer.getLastName() %></td>
<td class="py-3 px-4"><%= customer.getEmail() %></td>
<td class="py-3 px-4"><%= customer.getPhone() %></td>
<td class="py-3 px-4"><%= customer.getAddress() %></td>
<td class="py-3 px-4"><%= customer.getPassword() %></td>
</tr>
<%
                        }
                    } 
                    
                    else{
                %>
                <tr>
<td colspan="6" class="py-3 px-4 text-center text-gray-500">No customers found.</td>
</tr>
<%
                    }
                %>
                    
                     
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
  

   
</body>
</html>
