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
	<h1>Dashboard</h1>
	<a href="/user/create">Create user</a>
	<a href="/donations/create">Create donation</a>
	
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Donation Name</th>
				<th>Quantity</th>
				<th>Donors name</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allDonations}" var="donation">
				<tr>
					<td>${donation.id}</td>
					<td>${donation.donationName}</td>
					<td>${donation.quantity}</td>
					<td>${donation.donor.userName}</td>
					<td>
					<a href="/donations/${donation.id}/edit">Edit</a>
					<form action="/donations/delete/${donation.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<input type="submit" value="Delete"/>
					</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<h1>All the users</h1>
	
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>User Name</th>
				<th>Email</th>
				<th>how many Donations</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allUsers}" var="user">
				<tr>
					<td>${user.id}</td>
					<td><a href="/user/${user.id}">${user.userName}</a></td>
					<td>${user.email}</td>
					<td>${user.donations.size()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>