<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Team</title>
</head>
<body>

<h1>create a new Team</h1>

<form method="post" action=Teams>
<p>Team Name:
<input type=text" name="name" >
</p>
<input type="submit" value="create">
</form>

</body>
</html>