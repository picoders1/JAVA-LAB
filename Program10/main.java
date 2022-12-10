<%@ page language="java" contentType="text/html; charset=UTF-8
    pageEncoding="UTF-8" errorPage="error1.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="white">
<%
String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
String age = request.getParameter("age");
if(fname.isBlank() || lname.isBlank() || age.isBlank()){
	throw new Exception("Fields are empty");
}else if(Integer.parseInt(age)<1 || Integer.parseInt(age)>100){ 
	throw new Exception("Age out of range");
}else{
%>
First Name : <%=fname %><br>
Last Name : <%=lname %><br>
Age:<%=age %>
<%} %>
</body>
</html>


