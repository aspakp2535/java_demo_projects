<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page 1</title>
</head>
<body>
<% 
String username = request.getParameter("username");
out.println("Welcome " + username);
session.setAttribute("name",username);  
out.print("<a href='myjsp2.jsp'>visit</a>");  
%>
</body>
</html>