<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Андрей
  Date: 30.09.2020
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<h2>User</h2>
<table border="2" style="width:100px">
    <tr>
        <th>id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
    </tr>
    <c:forEach var="user" items="${user}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>

    <div>
        <form th:action="/logout" method="post">
            <input type="submit" value="Sign Out"/>
        </form>
    </div>
</table>