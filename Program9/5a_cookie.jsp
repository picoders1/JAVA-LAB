<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Date CreateTime=new Date(session.getCreationTime());
Date LastTime=new Date(session.getLastAccessedTime());

String user=request.getParameter("user");
String pass=request.getParameter("pass");

out.println("First_Name: "+user+"<br>");
out.println("Last_Name: "+pass+"<br>");
out.println("Session Id: "+session.getId()+"<br>");
out.println("first Time: "+CreateTime+"<br>");
out.println("Last Time: "+LastTime+"<br>");
Cookie First_Name=new Cookie("First_Name",user);
response.addCookie(First_Name);
%>
<a href="index.jsp">new page</a>
</body>
</html>
