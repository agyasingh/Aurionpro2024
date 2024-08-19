<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<main class="container p-4 mt-5 bg-white d-flex flex-column align-items-center justify-content-center text-secondary" style="min-height: 100vh;">
    <div class="col-10 col-sm-8 col-md-6 col-lg-5 col-xl-4 mb-4">
       <h1 class="display-4 font-weight-bold text-center" style="color: #007bff;">Welcome to Bankify.</h1>

    </div>
    
    <!-- Error Message Display -->
    <div class="col-10 col-sm-8 col-md-6 col-lg-5 col-xl-4 mb-4">
        <% 
            String message = (String) request.getAttribute("message");
            if (message != null) {
        %>
            <div class="alert alert-danger" role="alert">
                <%= message %>
            </div>
        <% } %>
    </div>
    
    <div class="col-10 col-sm-8 col-md-6 col-lg-5 col-xl-4 mb-4">
        <form action="LoginController" method="get">
            <div class="form-group">
                <label for="username">Username</label>
                <input id="username" class="form-control mb-3 p-2 bg-light border" type="text" name="username" required />
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input id="password" class="form-control mb-3 p-2 bg-light border" type="password" name="password" required />
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input id="email" class="form-control mb-3 p-2 bg-light border" type="email" name="email" required />
            </div>
            
            <div class="mb-3">
                <label class="form-label">Login as:</label>
                <div class="form-check">
                    <input id="login-admin" type="radio" name="role" value="admin" class="form-check-input" required />
                    <label for="login-admin" class="form-check-label">Admin</label>
                </div>
                <div class="form-check">
                    <input id="login-customer" type="radio" name="role" value="customer" class="form-check-input" required />
                    <label for="login-customer" class="form-check-label">Customer</label>
                </div>
            </div>

            <div class="d-flex align-items-center">
                <div class="form-check">
                    <input id="remember-me" type="checkbox" class="form-check-input" name="rememberMe" />
                    <label for="remember-me" class="form-check-label">Remember me!</label>
                </div>
                
                <button class="btn btn-dark ml-auto w-50" type="submit">Log In</button>
            </div>
        </form>
    </div>
</main>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
