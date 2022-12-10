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
Cookie[] c=null;
c=request.getCookies();
for (Cookie c1:c)
{
	out.println("cookie Name: "+c1.getName()+"<br>");
	out.println("cookie Value: "+c1.getValue()+"<br>");
}
%>
</body>
</html>



