<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Update Page</h1>
</center>
<form action="update">
<center>
<pre>
 RollNo     :<input type="hidden" name="rollno" value="${data.rollno}" placeholder="enter rollno" required><br>
 Name       :<input type="text" name="name" value="${data.name}" placeholder="enter name" required><br>
 Address    :<input type="text" name="address" value="${data.address}" placeholder="enter address" required><br>
 Email      :<input type="text" name="email" value="${data.email}" placeholder="enter email" required><br>
 Uname      :<input type="text" name="uname" value="${data.uname}" placeholder="enter uname" required><br>
 Password   :<input type="text" name="password" value="${data.password}" placeholder="enter password" required><br>
 
 <input type="submit" value="update">
</pre>
</center>
</form>
</body>
</html>