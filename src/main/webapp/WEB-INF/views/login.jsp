<%--
  Created by IntelliJ IDEA.
  User: Андрей
  Date: 15.09.2020
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Spring Security Example </title>
</head>
<body>
Login page
<form th:action="/login" method="post">
    <div><label> User Name : <input type="text" name="name"/> </label></div>
    <div><label> Password: <input type="password" name="password"/> </label></div>
    <div><input type="submit" value="Sign In"/></div>
</form>

<div>
    <form th:action="/logout" method="post">
        <input type="submit" value="Sign Out"/>
    </form>
    <a href="/registration">Add new user</a>
</div>
</body>
</html>
