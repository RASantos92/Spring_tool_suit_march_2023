<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<h1>Show one Donation</h1>
	<h2>Donation Name: <c:out value="${donation.donationName}"/></h2>
	<p>Quantity: ${donation.quantity}</p>
	<h3>Donor Name: <c:out value="${donation.donor.userName}"/></h3>
	
     <form action="/donations/${donation.id}" method="post">
    	<input type="hidden" name="_method" value="delete"/>
    	<input type="submit" value="delete" class="btn btn-outline-white btn-danger"/>
    </form>
</body>
</html>