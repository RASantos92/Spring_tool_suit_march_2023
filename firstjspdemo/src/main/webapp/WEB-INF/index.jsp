<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world</h1>
	<h2> <c:out value="${2+2}"/></h2>
	<h2> <c:out value="${someData}"/></h2>
	<h2>${someData}</h2>
	<h1>${test}</h1>
</body>
</html>