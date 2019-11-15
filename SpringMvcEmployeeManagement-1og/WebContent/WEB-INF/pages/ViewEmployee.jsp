
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="com.lti.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employee</title>
</head>
<body>

<table>
		<tr>
			<th>EmployeeId</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		
		<c:forEach var="emp" items="${ requestScope.employeeList}">
			<c:url var="deleteUrl" value="delete.do">
				<c:param name="employeeId" value="${emp.employeeId}"></c:param>
			</c:url>
			
			<c:url var= "updateUrl" value="updateEmployeePage">
				<c:param name="employeeId" value="${emp.employeeId}"></c:param>
				<c:param name="employeeName" value="${emp.employeeName}"></c:param>
				<c:param name="employeeSalary" value="${emp.employeeSalary}"></c:param>
				
			</c:url>
								
			
			<tr>
				<td> <c:out value="${emp.employeeId}"></c:out> </td>  
				<td> <c:out value="${emp.employeeName}"></c:out> </td>
				<td> <c:out value="${emp.employeeSalary}"></c:out> </td>
				<td><a href='<c:out value="${ deleteUrl }"></c:out>'>Delete</a></td>
				<td><a href='<c:out value="${ updateUrl }"></c:out>'>Update</a></td>
			</tr>
		</c:forEach>
</table>
		
</body>
</html>