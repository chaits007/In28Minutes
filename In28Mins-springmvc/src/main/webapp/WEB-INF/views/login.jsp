<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chaits JSP Page</title>
</head>
<body>
<form action="/login.do" method="post">
	Enter your Name 	<input type="text" name="name">
	Enter Password <input type="password" name="password"> 
	<br/><input type="submit" value="Login">
	<p><font color="red"><br/>${message}</font></p>
</form>
</body>
</html>