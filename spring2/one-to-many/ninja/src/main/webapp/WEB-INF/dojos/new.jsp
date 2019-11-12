<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new Dojo</title>
</head>
<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<h1>New Dojo</h1>

<form:form action="/dojos/createDojo" method="post" modelAttribute="dojo">


    <p>
       <form:label path="name">name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/> 
    </p>
    <input type="submit" value="Create"/>
</form:form>    
</body>
</html>