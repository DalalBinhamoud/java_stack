<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Iindex</title>
</head>
<body>
<h1><c:out value="${counter}"/></h1>
<h2><a href="http://localhost:8080/counter">Test Another Visit</a></h2>
</body>
</html>