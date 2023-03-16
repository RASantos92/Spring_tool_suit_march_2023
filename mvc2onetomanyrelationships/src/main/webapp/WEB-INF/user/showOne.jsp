<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Details</h1>
	<h3>User Name : <c:out value="${user.userName}"/></h3>
	<h3>User Email : <c:out value="${user.email}"/></h3>	
	
	<h3>All <c:out value="${user.userName }"/> donations </h3>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Donation Name</th>
				<th>Quantity</th>
				<th>Donors name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${user.donations}" var="donation">
				<tr>
					<td>${donation.id}</td>
					<td>${donation.donationName}</td>
					<td>${donation.quantity}</td>
					<td>${donation.donor.userName}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>