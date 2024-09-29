<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <%@ include file="header.jsp" %>
    <div class="content">
        <c:choose>
            <c:when test="${msg != null}">
                <h3>${msg}</h3>
            </c:when>
            <c:otherwise>
                <p>Please log in or register.</p>
            </c:otherwise>
        </c:choose>
    </div>
</body>
</html>
