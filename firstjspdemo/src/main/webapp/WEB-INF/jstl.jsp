<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 

<link rel="stylesheet" type="text/css" href="/css/style.css">
<meta charset="ISO-8859-1">
<title>JSTL demo</title>
</head>
<body>
	<h1>JSTL demo</h1>
	<h1 class="styleTest">Style testing</h1>
	
	<h1 class="text-success"> Displaying variables </h1>
	<p><c:out value="${name}"/></p>
	<p>${age}</p>
	<p>${isMillionaire}</p>
	<h1><c:out value="${test }"/></h1>
	
	<h1>if-statement</h1>
	<c:if test="${isMillionaire}">
		<p><c:out value="${name}"/> is a Millionaire</p>
	</c:if>

    <h1>if-else statement</h1>
    <c:choose>
    	<c:when test="${age < 21 }">
    		<p>cannot buy drinks yet</p>
    	</c:when>
    	<c:otherwise>
    		<p>you can buy drinks</p>
    	</c:otherwise>
    </c:choose>
    

    <h1>for each</h1>
    <ul>
	    <c:forEach var="eachUser" items="${users}">
	    	<li><c:out value="${eachUser}"/></li>
	    </c:forEach>
    </ul>
    
</body>
</html>