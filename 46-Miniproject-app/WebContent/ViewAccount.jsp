<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.aurionpro.entity.Account"  import="java.util.List"%>
<%@ include file="Navbar.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://cdn.tailwindcss.com"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Accounts</title>
</head>

<body>
<div class="flex flex-col">
    <div class="overflow-x-auto sm:-mx-6 lg:-mx-8">
        <div class="py-2 inline-block min-w-full sm:px-6 lg:px-8">
            <div class="overflow-hidden">
                <table class="min-w-full">
                    <thead class="border-b">
                        <tr>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Account ID</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Customer ID</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Account Number</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Account Type</th>
                            <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">Balance</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                    <%
                    // Retrieve the account list from the request attribute
                    List<Account> accounts = (List<Account>)request.getAttribute("accounts");
                    if (accounts != null && !accounts.isEmpty()) {
                        for (Account account : accounts) {
                    %>
                    <tr class="border-t border-gray-200">
                        <td class="py-3 px-4"><%= account.getAccountId() %></td>
                        <td class="py-3 px-4"><%= account.getCustomerId() %></td>
                        <td class="py-3 px-4"><%= account.getAccountNumber() %></td>
                        <td class="py-3 px-4"><%= account.getAccountType() %></td>
                        <td class="py-3 px-4"><%= account.getBalance() %></td>
                        
                    </tr>
                    <%
                        }
                    } 
                    else {
                    %>
                    <tr>
                        <td colspan="6" class="py-3 px-4 text-center text-gray-500">No accounts found.</td>
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
