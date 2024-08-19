<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.aurionpro.entity.Account"  import="java.util.List"%>
<%@ include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>View Accounts</title>
</head>

<body>
<div class="flex items-center justify-center p-12">
    <div class="mx-auto w-full max-w-[800px] bg-white p-8 rounded-lg shadow-lg">
        <h2 class="text-2xl font-bold mb-4 text-center text-[#07074D]">Customer Accounts</h2>

        <%
            // Retrieve the account list from the request attribute
            List<Account> accounts = (List<Account>) request.getAttribute("accounts");
        %>

        <table class="w-full border-collapse">
            <thead>
                <tr>
                    <th class="border py-2 px-4 text-left">Account ID</th>
                    <th class="border py-2 px-4 text-left">Customer ID</th>
                    <th class="border py-2 px-4 text-left">Account Number</th>
                    <th class="border py-2 px-4 text-left">Account Type</th>
                    <th class="border py-2 px-4 text-left">Balance</th>
                </tr>
            </thead>
            <tbody>
                <%
                    if (accounts != null && !accounts.isEmpty()) {
                        for (Account account : accounts) {
                %>
                <tr>
                    <td class="border py-2 px-4"><%= account.getAccountId() %></td>
                    <td class="border py-2 px-4"><%= account.getCustomerId() %></td>
                    <td class="border py-2 px-4"><%= account.getAccountNumber() %></td>
                    <td class="border py-2 px-4"><%= account.getAccountType() %></td>
                    <td class="border py-2 px-4"><%= account.getBalance() %></td>
                </tr>
                <%
                        }
                    } else {
                %>
                <tr>
                    <td colspan="5" class="border py-2 px-4 text-center">No accounts available.</td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
