<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" modelAttribute="employee">
Id:<form:input path="id"/>
Name:<form:input path="name"/>
Phone:<form:input path="phone"/>
Salary:<form:input path="salary"/>

<input type="submit">


</form:form>
</body>
</html>