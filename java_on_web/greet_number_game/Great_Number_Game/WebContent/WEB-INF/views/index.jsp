<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Great Number Game</title>
<style> <%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>
   <div class="container">
            <h1>Welcome to Great Number Game</h1>

            <p>I am thinking of a number between 1 and 100</p>
            <p>Take a guess</p>
            
 
             <div class="${booleanExpr ? 'right' : 'wrong'}">
                 <p><c:out value="${msg}"/></p>
            
            

                 
        </div>


        <form action='/Great_Number_Game/home' method='POST'>
            <input type="text" name="theNumber" ><br>
            <input type='submit' value='Submit'>
        </form>
        


</body>
</html>