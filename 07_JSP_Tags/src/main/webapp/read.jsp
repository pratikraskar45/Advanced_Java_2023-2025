<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>User details:</h1>
<!--scriptlet tag  -->

<%!
String name=null;
String email=null;
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,java.io.IOException
{
	 name= req.getParameter("uname");
	 email= req.getParameter("uemail");
}
/* automaic imported all  */
public void test(){
	List<String> list = new ArrayList<>();
}
%>
<%
		doPost(request, response);
	%>



<h3>
		Name :
		<%=name%></h3>
	<h3>
		Email :
		<%=email%></h3>
</body>
</html>