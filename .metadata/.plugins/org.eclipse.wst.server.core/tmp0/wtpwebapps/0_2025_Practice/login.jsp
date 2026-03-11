<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<section>
<div>
Login
<h3 style="color: red;">${msg}</h3>
</div>
<form action="login" method="post">
Email:<input type="email" name="email" placeholder="Enter user email id " required><br>
Password:<input type="password" name="pwd" required><br>
<input type="submit" value="Login"><br>
<p>Dont have a account </p>
<a href="register.jsp">Register now</a>
</form>
</section>
<script src="login.js"></script>
</body>
</html>