<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <%@ include file="header.jsp" %>
    <div class="container">
    	<h2>Login</h2>
	    <form action="login" method="post">
	        <label for="userName">Username</label>
	        <input type="text" name="userName" id="userName" required>
	
	        <label for="password">Password</label>
	        <input type="password" name="password" id="password" required>
	
	        <div class="error-message">${msg}</div>
			
			<button type="submit">Login</button>
			
		    <span class="register-link">
		        New User? <a href="/reg">Click here</a> to register.
		    </span>
	    </form>
    </div>
</body>
</html>
