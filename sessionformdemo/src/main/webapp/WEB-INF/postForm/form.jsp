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
	<h1>Review Form</h1>
	<p style="color: red"><c:out value="${error}"/></p>
	<form action="/process/review/form" method="post">
		<input type="hidden" name="reviewer" value=<c:out value="${name}"/> />
		<div>
			<label> Movie </label>
			<input type="text" name="movie"/>
		</div>
		<div>
			<label> Comment </label>
			<input type="text" name="comment"/>
		</div>
		<div>
			<label> Rating </label>
			<input type="number" name="rating" value="0"/>
		</div>
		<input type="submit" value="submit"/>
	</form>

</body>
</html>