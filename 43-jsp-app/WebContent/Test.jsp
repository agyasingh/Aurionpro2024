<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Vector"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<%
    // Retrieving the message
    String message = (String) request.getAttribute("message");
    out.println("Servlet communicated message to JSP: " + message);

    // Retrieving the Vector object
    Vector<String> vecObj = (Vector<String>) request.getAttribute("vecBean");
    out.println("Servlet to JSP communication of an object: " + vecObj.get(0));
%>

</body>
</html>
