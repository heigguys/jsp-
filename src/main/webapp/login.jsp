<%--
  Created by IntelliJ IDEA.
  User: zm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>登录页</title>
</head>
<body>
  <form action="loginServlet" method="post">
<%--  <form action="serv06" method="post">--%>
    姓名： <input type="text" name="uname"> <br>
    密码： <input type="password" name="upwd"> <br>
    <button type="submit">登录</button>
<%--    <span style="color: red; font-size: 12px">${msg}</span>--%>
<%--    <span style="color: red; font-size: 12px"><%=request.getAttribute("msg")%></span>--%>
    <span style="color: red; font-size: 12px">${msg}</span>
    <span style="color: red; font-size: 12px">${applicationScope}</span>
    <span style="color: red; font-size: 12px">${sessionScope}</span>
    <span style="color: red; font-size: 12px">${empty user}</span>
  </form>

</body>
</html>
