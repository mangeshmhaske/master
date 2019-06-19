<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<center>
<h1>ALL INFORMAITION</h1>
</center>

<script type="text/javascript">
function addUser() {
	
	document.fn.action="register.jsp";
	document.fn.submit();
}
function deleteUser() {
	
	document.fn.action="delete";
	document.fn.submit();
}
function editUser() {

	document.fn.action="edit";
	document.fn.submit();
}
</script>
</head>
<body>
	<form name="fn">


		<table border="1" align="center" color="red">
		<tr>
		    <th></th>
			<th>RollNo</th>
			<th>Name</th>
			<th>Address</th>
			<th>Email</th>
			<th>UserName</th>
			<th>Password</th>
		</tr>
		<tr>	
				<c:forEach items="${data}" var="student">
					<br>
					<td><input type="radio" name="rollno" value="${student.rollno}"></td>
					<td>${student.rollno}</td>
					<td>${student.name}</td>
					<td>${student.address}</td>
					<td>${student.email}</td>
					<td>${student.uname}</td>
					<td>${student.password}</td>
			</tr>
			</c:forEach>

		</table>

<table border="2" align="center">
<tr>
<td><input type="button" value="EDIT" onclick="editUser()"></td>
<td><input type="button" value="ADD" onclick="addUser()"></td>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>

</tr>
</table>
	</form>
</body>
</html>