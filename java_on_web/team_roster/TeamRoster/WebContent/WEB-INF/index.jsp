<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Roster</title>
</head>
<body>
<h1>ProtoType Roster</h1>

<p><c:out value="${msg}"/></p>

<a href="/TeamRoster/Teams">new team</a>
<table>

<tr>
<th>Team</th>
<th>Players</th>
<th>Action</th>
</tr>

 <c:forEach items="${teams}" var="current">
        <tr>
          <td><c:out value="${current.getTName()}" /><td>
          <td><c:out value="${current.getPlayers().length}" /><td>
          <td> <a href="/teamInfo">Details</a><a href="deleteTeam">delete</a></td>
        </tr>
      </c:forEach>


</table>
</body>
</html>