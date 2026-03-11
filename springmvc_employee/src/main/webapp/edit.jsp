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
<form:form action="update" modelAttribute="employee">
Id:<form:input path="id" readonly="true"/>
name:<form:input path="name"/>
phone:<form:input path="phone"/>
salary:<form:input path="salary"/>

<input type="submit">


</form:form>


</body>
</html>