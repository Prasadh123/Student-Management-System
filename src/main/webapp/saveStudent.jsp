<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT-MANAGEMENT-SYSTEM</title>
</head>
<body>
	<f:form action="addStudent" modelAttribute="student">
	<f:input path="studentName" placeholder="Enter Name"/>
	<f:input path="studentPhNo" placeholder="Enter PhNo"/>
	<input type="submit" value="save">
	
	</f:form>
</body>
</html>