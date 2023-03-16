<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/donations/process/new" method="post" modelAttribute="newDonation">
    <div class="form-group">
        <label>Donation Name</label>
        <form:input path="donationName" cla-ss="form-control" />
        <form:errors path="donationName" class="text-danger" />
    </div>
    <div class="form-group">
        <label>Quantity</label>
        <form:input path="quantity" class="form-control" />
        <form:errors path="quantity" class="text-danger" />
    </div>
    <label>Donor</label>
    <form:select path="donor">
    	<c:forEach var="user" items="${allUsers}">
    		<form:option value="${user.id}">
    			<c:out value="${user.userName}"/>
    		</form:option>
    	</c:forEach>
    </form:select>
    <input type="submit" value="add donation" class="btn btn-primary" />
</form:form>
</body>
</html>