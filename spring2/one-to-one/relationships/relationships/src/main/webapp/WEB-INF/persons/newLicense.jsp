<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new License</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<h1>New License</h1>

<form:form action="/licenses/new" method="post" modelAttribute="license">
    <p>
        Person:

  <select name="person">
  

       <c:forEach items="${persons}" var="person">

        <option  value="${person.id}" >  
            <c:out value="${person.firstName}"/>
        </option>
        </c:forEach>
        
            </select>
            
            
    </p>
      <p>
        <form:label path="state">State</form:label>
        <form:errors path="state"/>
        <form:input path="state"/>
    </p>
       <p>
        <form:label path="expirationDate">Expiration Date</form:label>
        <form:errors path="expirationDate"/>
        <form:input path="expirationDate"/>
    </p>    
    <input type="submit" value="Create"/>
</form:form>   
</body>
</html>