<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT-MANAGEMENT-SYSTEM</title>
</head>
<body>

	<form:form action="saveUpdatedStudent" modelAttribute="student">
		<form:input path="studentId" readonly="true"/>
		<form:input path="studentName"/>
		<form:input path="studentPhNo"/>
		<input type="submit" value="update">
	</form:form>
	
</body>
</html>