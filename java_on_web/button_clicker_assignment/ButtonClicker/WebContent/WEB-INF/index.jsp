<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Button Clicker</title>
</head>
<body>

<form action=buttonCounter>
<input type="submit" value="Click Me!">
</form>

<P>You have clicked this button <c:out value="${count}"/> times</P>
</body>
</html>