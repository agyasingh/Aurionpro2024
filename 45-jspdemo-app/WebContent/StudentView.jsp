<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List</title>
</head>
<body>

<h2>Student List</h2>

<table border="1">
    <thead>
        <tr>
            <th>Roll Number</th>
            <th>Name</th>
            <th>Percentage</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.roll_number}</td>
                <td>${student.name}</td>
                <td>${student.percentage}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
