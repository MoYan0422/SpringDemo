<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Multiple</title>
</head>
<body>
<p>
<a href="resultmultilang.controller?locale=zh-Tw">中文</a>
<a href="resultmultilang.controller?locale=en-US">English</a>
</p>
<spring:message code="program.error"></spring:message>

</body>
</html>