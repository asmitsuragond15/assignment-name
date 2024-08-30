<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ServletOne" method="get">
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" class="name" required><br>
		
		<label for="place">Place:</label>
		<input type="text" id="place" name="place" class="place" required><br>
		
		<input type="submit" value="Submit">
	</form>
</body>
</html>
