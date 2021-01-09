<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Student Confirmation</title>
</head>
<body>
	<h2>The Student is confirmed: ${student.firstName} ${student.lastName}
		<br/><br/>
		Country: ${student.country}
		<br/><br/>
		Favorite Language: ${student.favoriteLanguage}
		<br/><br/>
		Operating System:
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}">
				<li>${temp}</li>
			</c:forEach>
		</ul>
	</h2>
</body>
</html>