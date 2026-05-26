<%--
  Created by IntelliJ IDEA.
  User: zm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<c:set var="username" value="admin"/>
<c:out value="${username}"></c:out>
<%
  int score = 60;
  int score1 = 40;
  request.setAttribute("score", score);
  request.setAttribute("score1", score1);
%>
<c:if test="${score >= 60}">
  及格
</c:if>
<c:if test="${score1 < 60}">
  不及格
</c:if>
</body>
</html>
