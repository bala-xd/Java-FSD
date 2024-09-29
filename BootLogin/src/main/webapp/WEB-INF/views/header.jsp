<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="navbar">
	    <a href="/">
	    	<h1>Login App</h1>
	    </a>
	    <nav>
	        <a href="/">Home</a>
	        <a href="/profile">Profile</a>
	        <c:choose>
	        	<c:when test="${empty sessionScope.user}">
	                <a href="/login">Login</a>
	                <a href="/register">Register</a>
	            </c:when>
	            <c:otherwise>
	                <a href="/logout">Logout</a>
	            </c:otherwise>
	        </c:choose>
	    </nav>
	</div>
</body>
</html>
