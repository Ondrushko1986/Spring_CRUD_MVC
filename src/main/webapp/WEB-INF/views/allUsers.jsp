%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>All Users</title>
</head>
<body>
<br>
<br>
<br>
<a href="${pageContext.request.contextPath}/addUser">Add User</a>
<br>
<h3>List of all users</h3>
${message}
<br>
<br>
<table border="1px" cellpadding="0" cellspacing="0">
    <thead>
    <tr>
        <th>name</th>
        <th>email</th>
        <th>password</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.password}</td>
            <td><a
                    href="${pageContext.request.contextPath}/editUser/${user.id}">Edit</a></td>
            <td><a
                    href="${pageContext.request.contextPath}/deleteUser/${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>


</table>
</body>
</html>