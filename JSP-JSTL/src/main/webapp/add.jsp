<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addition</title>
</head>
<body>

<c:set var="first" value="5" />
<c:set var="second" value="7" />

<c:set var="sum" value="${first + second}" />

<p>The sum of ${first} and ${second} is ${sum}.</p>
</body>
</html>