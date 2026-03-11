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
<h1>Register</h1>
 <h3 style="color: red;">${msg}</h3>
</div>
<form method="post" action="register">
Name:<input  type="text" placeholder="Enter name here" name="name" required> <br>
Email:<input type="email" placeholder="ENter email here" name="email" required><br>
Password:<input type="password" placeholder="enter password here" name="pwd" required><br>
Confirm Password:<input type="password" placeholder="enter confirm password here" name="pwd2" required><br>
<input type="submit" value="Register">
<p>have a account </p>
<a href="login.jsp">login now</a>
</form>
</section>
</body>
</html>