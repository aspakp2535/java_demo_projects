<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  

<h1><c:out value="${'Welcome to JSTL'}"></c:out></h1>

<c:set var="Tag" scope="session" value="${'Core Tag'}"/>  
<h3><c:out value="${Tag}"/></h3>  

</body>  
</html> 