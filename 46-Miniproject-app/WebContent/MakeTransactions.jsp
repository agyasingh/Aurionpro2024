<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="CustomerNavbar.jsp" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Make a Transaction</title>
</head>
<body>

<div class="flex items-center justify-center p-12">
    <div class="mx-auto w-full max-w-[550px] bg-white p-8 rounded-lg shadow-lg">
        <form action="TransactionController" method="post">
            
            <div class="mb-5">
                <label for="transactionType" class="mb-3 block text-base font-medium text-[#07074D]">Transaction Type</label>
                <select name="transactionType" id="transactionType"
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md">
                    <option value="credit" <%= "credit".equals(request.getAttribute("transactionType")) ? "selected" : "" %>>Credit</option>
                    <option value="debit" <%= "debit".equals(request.getAttribute("transactionType")) ? "selected" : "" %>>Debit</option>
                    <option value="transfer" <%= "transfer".equals(request.getAttribute("transactionType")) ? "selected" : "" %>>Transfer</option>
                </select>
            </div>
            
            <div class="mb-5">
                <label for="senderAccountNumber" class="mb-3 block text-base font-medium text-[#07074D]">Your Account Number</label>
                <input type="text" name="senderAccountNo" id="senderAccountNumber"
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                    value="<%= request.getAttribute("senderAccountNo") != null ? request.getAttribute("senderAccountNo") : "" %>" readonly />
            </div>
            
            <div class="mb-5">
                <label for="receiverAccountNumber" class="mb-3 block text-base font-medium text-[#07074D]">To Account Number</label>
                <input type="text" name="receiverAccountNo" id="receiverAccountNumber"
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                    value="<%= request.getAttribute("receiverAccountNo") != null ? request.getAttribute("receiverAccountNo") : "" %>" />
            </div>
            
            <div class="mb-5">
                <label for="amount" class="mb-3 block text-base font-medium text-[#07074D]">Amount</label>
                <input type="number" step="0.01" name="amount" id="amount"
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md"
                    value="<%= request.getAttribute("amount") != null ? request.getAttribute("amount") : "" %>" />
            </div>
            
            <div>
                <% 
                    String message = (String) request.getAttribute("message");
                    if (message != null && !message.isEmpty()) {
                %>
                    <p class="text-red-500"><%= message %></p>
                <% } %>
            </div>
            
            <div>
                <button type="submit"
                    class="hover:shadow-form w-full rounded-md bg-[#6A64F1] py-3 px-8 text-center text-base font-semibold text-white outline-none">
                    Submit
                </button>
            </div>
        </form>
    </div>
</div>

</body>
</html>
