<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT-MANAGEMENT-SYSTEM</title>
</head>
<body>
	<h1>Students List</h1>
	
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>PH-NO</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>	
		
		<c:forEach var="student" items="${students}">
		<tr>
		
		<td>${student.getStudentId()}</td>
		<td>${student.getStudentName()}</td>
		<td>${student.getStudentPhNo()}</td>
		<td><a href="updateStudent?id=${student.getStudentId()}">Update</a></td>
		<td><a href="deleteStudent?id=${student.getStudentId()}">Delete</a></td>
		</tr>
		
		</c:forEach>
	
	</table>
</body>
</html>