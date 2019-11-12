<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new person</title>
</head>
<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<h1>New Person</h1>
<form:form action="/persons/createPerson" method="post" modelAttribute="person">
    <p>
      <%--   <form:label path="first_name">First Name</form:label>
        <form:errors path="first_name"/>
        <form:input path="first_name"/> --%>
        first name:
         <input name="firstName" placeholder="enter  ur first name" />
    </p>
    <p>
     <%--   <form:label path="lastName">Last Name</form:label>
        <form:errors path="lastName"/> --%>
        last name:
        <input name="lastName" placeholder="enter  ur lastname" />
       <%--  <form:input path="lastName"/> --%>
    </p>   
    <input type="submit" value="Create"/>
</form:form>    
</body>
</html>