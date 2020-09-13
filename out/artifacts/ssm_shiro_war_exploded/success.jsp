<%--
  Created by IntelliJ IDEA.
  User: SXT
  Date: 2019/10/9
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功页面</title>
    <base href="<%=request.getContextPath()+"/"%>">
</head>
<body>
<h3>成功页面</h3>
<h4 style="float: right"><a href="loginOut">退出</a></h4>
<h3>sessionID:<%=session.getId()%></h3>
</body>
</html>
