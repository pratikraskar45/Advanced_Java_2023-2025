<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<th>id</th>
<th>name</th>
<th>phone</th>
<th>salary</th>
<th>delete</th>
<th>edit</th>
</tr>


<c:forEach var="employee" items="${list}">
<tr>
<td>${employee.id}</td>
<td>${employee.name}</td>
<td>${employee.phone}</td>
<td>${employee.salary}</td>
<td><a href="delete?id=${employee.id}">delete</a>
<td><a href="edit?id=${employee.id}">edit</a>


</tr>


</c:forEach>



</table>
</body>
</html>