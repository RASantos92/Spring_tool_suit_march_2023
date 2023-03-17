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
 <h1>create a donation</h1>
    <form:form action="/donations/process/create" modelAttribute="donation" method="post">
        <form:input type="hidden" path="donor" value="${user_id}"/>
        <div>
            <label> Donation Name</label>
            <form:input type="text" path="donationName"/>
            <form:errors path="donationName"/>
        </div>
        <div>
            <label> Quantity</label>
            <form:input type="text" path="quantity"/>
            <form:errors path="quantity"/>
        </div>
        <input type="submit" value="add donation" class="btn btn-outline-success"/>
        </form:form>

</body>
</html>