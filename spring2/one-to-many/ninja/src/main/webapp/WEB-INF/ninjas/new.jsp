<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new Ninja</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<h1>New Ninja</h1>

<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
    <p>
        Dojo:

  <select name="dojo">
  

       <c:forEach items="${dojos}" var="dojo">

        <option  value="${dojo.id}" >  
            <c:out value="${dojo.name}"/>
        </option>
        </c:forEach>
            </select>    
    </p>
    
    
      <p>
        <form:label path="firstName">First Name:</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
         
     <p>
        <form:label path="lastName">Last Name:</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
    
     <p>
        <form:label path="age">Age:</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>
    </p>
    
    <input type="submit" value="Create"/>
</form:form>   
</body>
</html>