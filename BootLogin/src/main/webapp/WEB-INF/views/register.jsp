<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <%@ include file="header.jsp" %>
    <div class="container">
	    <h2>Register</h2>
	    <form action="register" method="post">
	        <label for="userName">User Name</label>
	        <input type="text" name="userName" id="userName" required>
	
	        <label for="email">Email</label>
	        <input type="email" name="email" id="email" required>
	
	        <label for="password">Password</label>
	        <input type="password" name="password" id="password" required>
	
	        <label for="dob">Date of Birth</label>
	        <input type="date" name="dob" id="dob" required>
	        
	        <div class="error-message">${msg}</div>
	
	        <button type="submit">Sign Up</button>
	        
	        <span class="register-link">
		        Already a user? <a href="/login">Click here</a> to sign in.
		    </span>
	    </form>
    </div>
</body>
</html>