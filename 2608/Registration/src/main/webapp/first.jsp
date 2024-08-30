<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP First File</title>
</head>
<body>



	<% int x;
	int y;
	%>
	<%
	x=10;
	y=15;
	%>
	
	
	<h2>Value of x = <%=x %></h2>
	<h2>Value of y = <%=y %></h2>
</body>
</html>