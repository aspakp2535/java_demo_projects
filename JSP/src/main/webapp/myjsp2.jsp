<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page 2</title>
</head>
<body>
<%
String name=(String)session.getAttribute("name");  
out.println("Hi " + name);
%>
</body>
</html>