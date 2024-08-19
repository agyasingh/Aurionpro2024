<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.aurionpro.entity.Transactions" import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>View Passbook</title>
</head>
<body>

<%@ include file="CustomerNavbar.jsp" %>

<div class="flex items-center justify-center p-12">
    <div class="mx-auto w-full max-w-[800px] bg-white p-8 rounded-lg shadow-lg">
        <h2 class="text-2xl font-bold mb-4 text-center text-[#07074D]">Passbook Transactions</h2>

        <% 
            // Retrieve the list of transactions from the request attribute
            List<Transactions> transactions = (List<Transactions>) request.getAttribute("transactions");
        %>

        <table class="w-full border-collapse">
            <thead>
                <tr>
                    <th class="border py-2 px-4 text-left">Sender Account Number</th>
                    <th class="border py-2 px-4 text-left">Receiver Account Number</th>
                    <th class="border py-2 px-4 text-left">Transaction Type</th>
                    <th class="border py-2 px-4 text-left">Amount</th>
                    <th class="border py-2 px-4 text-left">Date</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    if (transactions != null && !transactions.isEmpty()) {
                        for (Transactions transaction : transactions) {
                %>
                <tr>
                    <td class="border py-2 px-4"><%= transaction.getSenderAccountNo() %></td>
                    <td class="border py-2 px-4"><%= transaction.getReceiverAccountNo() %></td>
                    <td class="border py-2 px-4"><%= transaction.getTransactionType() %></td>
                    <td class="border py-2 px-4"><%= transaction.getAmount().setScale(2) %></td>
                    <td class="border py-2 px-4"><%= transaction.getTransactionDate() %></td>
                </tr>
                <% 
                        }
                    } else {
                %>
                <tr>
                    <td colspan="5" class="border py-2 px-4 text-center">No transactions available.</td>
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
