<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html> 
<html>
<head>
    <title>JSTL Core Tags Example</title>
</head>
<body>
    <h1>JSTL Core Tags Example</h1>
    
    <c:set var="message" value="Hello, JSTL!" />
    
    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>
    
    <c:forEach var="i" begin="1" end="5">
        <p>Iteration ${i}</p>
    </c:forEach>
    
    <c:choose>
        <c:when test="${2 > 1}">
            <p>2 is greater than 1</p>
        </c:when>
        <c:otherwise>
            <p>2 is not greater than 1</p>
        </c:otherwise>
    </c:choose>
    
    <c:out value="ThankYou <h1>Hello</h1>" escapeXml="false" />
</body>
</html>
