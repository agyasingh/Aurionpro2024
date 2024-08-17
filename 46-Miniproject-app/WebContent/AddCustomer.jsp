<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="Navbar.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://cdn.tailwindcss.com"></script>
<title>Insert title here</title>
</head>
<body>


  <div class="container mx-auto p-4">
    <div class="max-w-md mx-auto bg-white rounded-lg shadow-md overflow-hidden md:max-w-xl">
        <div class="md:flex">
            <div class="w-full px-6 py-8 md:p-8">
                <h2 class="text-2xl font-bold text-gray-800">Add Customer</h2>
                <p class="mt-4 text-gray-600">Please fill out the form below to add a new customer.</p>
                <form action="AddCustomerController" method="post" class="mt-6">
                
                
       <c:if test="${not empty message}">
            <div class="mb-4 p-4 bg-green-200 text-green-800 rounded">
                ${message}
            </div>
        </c:if>
        
                    <div class="mb-6">
                        <label class="block text-gray-800 font-bold mb-2" for="user_id">
                            User ID
                        </label>
                        <input class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="user_id" name="user_id" type="text" required>
                    </div>
                    <div class="mb-6">
                        <label class="block text-gray-800 font-bold mb-2" for="first_name">
                            First Name
                        </label>
                        <input class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="first_name" name="first_name" type="text" required>
                    </div>
                    <div class="mb-6">
                        <label class="block text-gray-800 font-bold mb-2" for="last_name">
                            Last Name
                        </label>
                        <input class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="last_name" name="last_name" type="text"  required>
                    </div>
                    <div class="mb-6">
                        <label class="block text-gray-800 font-bold mb-2" for="email">
                            Email
                        </label>
                        <input class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="email" name="email" type="email" required>
                    </div>
                    <div class="mb-6">
                        <label class="block text-gray-800 font-bold mb-2" for="phone">
                            Phone
                        </label>
                        <input class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="phone" name="phone" type="text" required>
                    </div>
                    <div class="mb-6">
                        <label class="block text-gray-800 font-bold mb-2" for="address">
                            Address
                        </label>
                        <input class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="address" name="address" type="text" required>
                    </div>
                    
                    <div class="mb-6">
                        <label class="block text-gray-800 font-bold mb-2" for="address">
                           Create password
                        </label>
                        <input class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="password" name="password" type="text" required>
                    </div>
                    
                    <button class="bg-indigo-500 hover:bg-indigo-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline" type="submit">
                        Add Customer
                    </button>
                </form>
            </div>
        </div>
    </div>
</div>



</body>
</html>