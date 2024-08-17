<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="Navbar.jsp" %>
<%@ page import="com.aurionpro.entity.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://cdn.tailwindcss.com"></script>
<title>Add Account</title>
<script>
    function generateAccountNumber() {
        // Generate a random account number (e.g., 10-digit number)
        const accountNumber = Math.floor(1000000000 + Math.random() * 9000000000);
        document.getElementById('accountNumber').value = accountNumber;
    }
</script>
</head>
<body>

<div class="flex items-center justify-center p-12">
    <div class="mx-auto w-full max-w-[550px] bg-white">
        <!-- Display message -->
        <%
            String message = (String) request.getAttribute("message");
            if (message != null) {
                out.println("<div class='mb-5 p-3 text-white bg-green-500 rounded-md'>" + message + "</div>");
            }
        %>

        <!-- Search Customer Form -->
        <form action="SearchCustomerServlet" method="post">
            <div class="mb-5">
                <label for="searchCustomerId" class="mb-3 block text-base font-medium text-[#07074D]">
                   Customer ID
                </label>
                <input type="text" name="customerId" id="searchCustomerId" 
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md" />
            </div>
            <button type="submit" 
                class="hover:shadow-form w-full rounded-md bg-[#6A64F1] py-3 px-8 text-center text-base font-semibold text-white outline-none">
                Search Customer
            </button>
        </form>

        <!-- Display Customer Details -->
        <%
            Customer customer = (Customer) request.getAttribute("customer");
            if (customer != null) {
        %>
        <div class="mt-8">
            <h2 class="text-xl font-semibold mb-4">Customer Details</h2>
            <table class="w-full border-collapse border border-gray-300">
                <thead>
                    <tr>
                        <th class="border border-gray-300 px-4 py-2">Field</th>
                        <th class="border border-gray-300 px-4 py-2">Value</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="border border-gray-300 px-4 py-2">Customer ID</td>
                        <td class="border border-gray-300 px-4 py-2"><%= customer.getCustomerId() %></td>
                    </tr>
                    <tr>
                        <td class="border border-gray-300 px-4 py-2">First Name</td>
                        <td class="border border-gray-300 px-4 py-2"><%= customer.getFirstName() %></td>
                    </tr>
                    <tr>
                        <td class="border border-gray-300 px-4 py-2">Last Name</td>
                        <td class="border border-gray-300 px-4 py-2"><%= customer.getLastName() %></td>
                    </tr>
                    <tr>
                        <td class="border border-gray-300 px-4 py-2">Email</td>
                        <td class="border border-gray-300 px-4 py-2"><%= customer.getEmail() %></td>
                    </tr>
                    <tr>
                        <td class="border border-gray-300 px-4 py-2">Phone</td>
                        <td class="border border-gray-300 px-4 py-2"><%= customer.getPhone() %></td>
                    </tr>
                    <tr>
                        <td class="border border-gray-300 px-4 py-2">Address</td>
                        <td class="border border-gray-300 px-4 py-2"><%= customer.getAddress() %></td>
                    </tr>
                </tbody>
            </table>
        </div>
        <%
            }
        %>

        <!-- Add Account Form -->
        <form action="AddAccountController" method="post" class="mt-8">
            <div class="mb-5">
                <label for="customerId" class="mb-3 block text-base font-medium text-[#07074D]">
                   Customer ID
                </label>
                <input type="text" name="customerId" id="customerId" 
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md" required />
            </div>
            <div class="mb-5">
                <label for="accountNumber" class="mb-3 block text-base font-medium text-[#07074D]">
                   Account Number
                </label>
                <input type="text" name="accountNumber" id="accountNumber" readonly
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md" />
                <button type="button" onclick="generateAccountNumber()"
                    class="hover:shadow-form w-full rounded-md bg-[#6A64F1] py-2 px-4 text-center text-base font-semibold text-white outline-none mt-2">
                    Generate Account Number
                </button>
            </div>
            <div class="mb-5">
                <label for="accountType" class="mb-3 block text-base font-medium text-[#07074D]">
                   Account Type
                </label>
                <select name="accountType" id="accountType" 
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md">
                    <option value="savings">Savings</option>
                    <option value="checking">Checking</option>
                </select>
            </div>
            <div class="mb-5">
                <label for="balance" class="mb-3 block text-base font-medium text-[#07074D]">
                   Balance
                </label>
                <input type="number" step="0.01" name="balance" id="balance" 
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md" required />
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
