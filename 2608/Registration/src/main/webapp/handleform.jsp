<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
// Retrieve the parameters from the request
String username = request.getParameter("first");
String password = request.getParameter("password");
String email = request.getParameter("email");
String address = request.getParameter("address");
String dob = request.getParameter("date");
String gender = request.getParameter("gender");
%>
// Display the Parameter 
<h2>The Username is <%= username %> </h2>
<h2>The password is <%= password %></h2>
<h2>The email  is <%= email %> </h2>
<h2>The Address is <%= address %> </h2>
<h2>The Date of Birth is <%= dob %> </h2>
<h2>The Gender is <%= gender %> </h2>


</body>
</html>
