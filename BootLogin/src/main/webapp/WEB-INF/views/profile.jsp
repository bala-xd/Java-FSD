<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Profile</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <%@ include file="header.jsp" %>
    
    <%-- <c:if test="${user == null}">
        <jsp:forward page="login.jsp"></jsp:forward>
    </c:if> --%>

    <div class="content">
        <h2>User Profile</h2>
        <table class="profile-table">
            <tr>
                <th>UserID</th>
                <td>${user.userId}</td>
            </tr>
            <tr>
                <th>UserName</th>
                <td>${user.userName}</td>
            </tr>
            <tr>
                <th>Email</th>
                <td>${user.email}</td>
            </tr>
            <tr>
                <th>DOB</th>
                <td>${user.dob}</td>
            </tr>
        </table>
    </div>
</body>
</html>