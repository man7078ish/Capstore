<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Customer registered successfully...........</h1>
		<table>
		<tr><td>Customer Id: <td>${customer.customerId}</td></tr>
		<tr><td>First Name: <td>${customer.firstName}</td></tr>
		<tr><td>Last Name: <td>${customer.lastName}</td></tr>
		<tr><td>Age: <td>${customer.age}</td></tr>
		<tr><td>Mobile No: <td>${customer.mobileNo}</td></tr>
		<tr><td>Email Id: <td>${customer.email}</td></tr>
		<tr><td>City: <td>${customer.city}</td></tr>
		
		</table>
	
	</body>
</html>