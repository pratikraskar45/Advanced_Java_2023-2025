<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> <i>Hi welcome to Jsp tags</i></h1>
<!--Decleration Tag(varibles and methods)  -->
<%!int a=10;
public int test(){
	return 1000;
}%>
<!-- Expression tag print into browser -->
<h2><%= a %></h2><br>
<h2><%= test() %></h2>

<!-- scriptlet tags java methods -->
<% int b =20;
   out.print("Hello this is a jsp printer"); 		
   out.print(b);
   
%> 
<br>
<%=b%>

</body>
</html>