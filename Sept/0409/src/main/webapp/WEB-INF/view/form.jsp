<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/form/processForm">
<label>Name:</label>
	<input type="text" name="uname"><br>
		<label>Email:</label>
	<input type="email" name="email"><br>
		<label>Password:</label>
	<input type="password" name="pass"><br>
		<label>Confirm Password:</label>
	<input type="password" name="cpass"><br>
	<input type="submit" value="submit">

</form>
	
	
</body>
</html>