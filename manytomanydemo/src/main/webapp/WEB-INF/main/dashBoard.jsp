<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<form:form action="/games/create" method="post" modelAttribute="game">
    <div class="form-group">
        <label>Title</label>
        <form:input path="title" class="form-control" />
        <form:errors path="title" class="text-danger" />
    </div>
    <div class="form-group">
        <label>Genres</label>
        <form:input path="genresFromForm" class="form-control" />
        <form:errors path="genresFromForm" class="text-danger" />
    </div>
    <input type="submit" value="Add game" class="btn btn-primary" />
</form:form>
<hr/>

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Title</th>
      <th scope="col">Genres</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${ allGames}" var="game">
    <tr>
			<td>${game.id}</td>
			<td>${game.title}</td>
			<td><c:forEach items="${game.genres}" var="genre">
				${genre.name},
			</c:forEach></td>
    </tr>
	</c:forEach>
  </tbody>
</table>
</body>
</html>