<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Customer Confirmation</title>
</head>
<body>
	<h2>The Customer is confirmed: ${customer.firstName} ${customer.lastName}
		<br/><br/>
		Passes: ${customer.freePasses}
		<br/><br/>
		Postal Code: ${customer.postalCode}
	</h2>
</body>
</html>