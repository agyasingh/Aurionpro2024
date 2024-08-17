<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="CustomerNavbar.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://cdn.tailwindcss.com"></script>
<title>Edit Profile</title>
</head>
<body>

<div class="flex items-center justify-center p-12">
    <div class="mx-auto w-full max-w-[550px] bg-white">
        <% 
            // Retrieve the message from request attributes
            String message = (String) request.getAttribute("message");
            if (message != null && !message.isEmpty()) {
        %>
            <div class="mb-5 p-3 text-center text-white 
                    <%= message.contains("successfully") ? "bg-green-500" : "bg-red-500" %> rounded-md">
                <%= message %>
            </div>
        <% 
            }
        %>
        <form action="UpdateProfileServlet" method="post">
           
            <div class="mb-5">
                <label for="first_name" class="mb-3 block text-base font-medium text-[#07074D]">
                   Name
                </label>
                <input type="text" name="name" id="name" 
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md" />
            </div>
            
            <div class="mb-5">
                <label for="first_name" class="mb-3 block text-base font-medium text-[#07074D]">
                   Email
                </label>
                <input type="text" name="email" id="name" 
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md" />
            </div>
            
            
            <div class="mb-5">
                <label for="email" class="mb-3 block text-base font-medium text-[#07074D]">
                   Password
                </label>
                <input type="password" name="password" id="password" 
                    class="w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-base font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md" />
            </div>
            
            
            <div>
                <button
                    class="hover:shadow-form w-full rounded-md bg-[#6A64F1] py-3 px-8 text-center text-base font-semibold text-white outline-none">
                    Edit Profile
                </button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
