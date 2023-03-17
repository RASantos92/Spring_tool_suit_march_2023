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
	<h1>Dashboard</h1>
	<a class="btn btn-outline-danger" href="/users/logout">logout</a>
	<a href="/donations/create" class="btn btn-outline-primary">add Donation</a>
	<h1> Welcome <c:out value="${loggedInUser.userName}"/></h1>
	<table>
    <thead> 
        <tr> 
            <th> Donation </th>
            <th> Quantity </th>
            <th> Donor </th>
            <th> Action </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="eachDonation" items="${allDonations}"> 
            <tr>
                <td><a href="/donations/${eachDonation.id}"><c:out value="${eachDonation.donationName}"/></a></td>
                <td><c:out value="${eachDonation.quantity}"/></td>
                <td><c:out value="${eachDonation.donor.userName}"/></td>
                <td>
                <a class="btn btn-warning" href="/donations/edit/${eachDonation.id}">Edit</a>
                <form action="/donations/${eachDonation.id}" method="post">
                	<input type="hidden" name="_method" value="delete"/>
                	<input type="submit" value="delete" class="btn btn-outline-white btn-danger"/>
                </form>
                </td>
            </tr>
        </c:forEach>
    </tbody>
    </table>
</body>
</html>