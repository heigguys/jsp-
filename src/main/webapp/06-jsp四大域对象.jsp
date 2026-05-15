<%--
  Created by IntelliJ IDEA.
  User: zm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp四大域对象</title>
</head>
<body>
  <%--
    jsp四大域对象
  --%>
  <%

    pageContext.setAttribute("name1", "zhangSan");
    request.setAttribute("name2", "lisi");
    session.setAttribute("name3", "wangwu");
    application.setAttribute("name4", "liliu");
  %>
    <%--jsp服务端跳转--%>
<%--    <jsp:forward page="06-jsp四大域对象-01.jsp"></jsp:forward>--%>
<%--    超链接跳转--%>
<a href="06-jsp四大域对象-01.jsp">跳转</a>
</body>
</html>
