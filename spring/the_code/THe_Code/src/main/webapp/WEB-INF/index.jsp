<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<p><c:out value="${error}"/></p>
<h1>What is the Code?</h1>
<form action="/showCode" method=post>
<input name="name" type="text"/>
<input type="submit" value="Try Code"/> 
</form>
</body>
</html>