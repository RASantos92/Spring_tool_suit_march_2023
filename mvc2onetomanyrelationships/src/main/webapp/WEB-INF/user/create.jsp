<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>create a new user</h1>
	<form:form action="/user/process/new" method="post" modelAttribute="newUser">
    <div class="form-group">
        <label>UserName</label>
        <form:input path="userName" cla-ss="form-control" />
        <form:errors path="userName" class="text-danger" />
    </div>
    <div class="form-group">
        <label>Email</label>
        <form:input path="email" class="form-control" />
        <form:errors path="email" class="text-danger" />
    </div>
    <input type="submit" value="add user" class="btn btn-primary" />
</form:form>
</body>
</html>