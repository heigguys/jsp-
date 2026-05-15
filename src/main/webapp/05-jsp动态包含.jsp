<%--
  Created by IntelliJ IDEA.
  User: zm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>静态包含</title>
</head>
<body>
    <jsp:include page="04-jsp-header.jsp"></jsp:include>
  <h2>中间内容</h2>
<%--    <jsp:include page="04-jsp-footer.jsp"></jsp:include>--%>
    <%
        String s1 = "动态传参";
    %>
    <jsp:include page="04-jsp-footer.jsp">
        <jsp:param name="username" value="admin"/>
        <jsp:param name="msg" value="<%=s1%>"/>
    </jsp:include>
</body>
</html>
