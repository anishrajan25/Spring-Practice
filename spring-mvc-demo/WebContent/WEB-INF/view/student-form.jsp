<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		
		First Name: <form:input path="firstName" /> 
		<br/><br/>
		
		Last Name: <form:input path="lastName" />
		<br/><br/>
		
		<form:select path="country">
			<form:options items="${student.countryList}" />
		</form:select>
		<br/><br/>
		
		Favorite Language: 
		<form:radiobutton path="favoriteLanguage" value="Java" /> Java
		<form:radiobutton path="favoriteLanguage" value="JS" /> JS
		<form:radiobutton path="favoriteLanguage" value="Python" /> Python
		<form:radiobutton path="favoriteLanguage" value="C" /> C
		<br/><br/>
		
		Operating Systems: 
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		<br/><br/>
		
		<input type="submit" value="submit" />
		
	</form:form>

</body>
</html>