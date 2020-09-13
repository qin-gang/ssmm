<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/26 0026
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
    <base href="<%=request.getContextPath()+"/"%>">
</head>
<body>
  <h3 style="float: right"><a href="logOut">退出</a></h3>
  <shiro:hasRole name="管理员">
      <a>添加用户</a>
      <a>修改用户</a>
      <a>查询用户</a>
      <a>删除用户</a>
      <a>查询客户</a>
      <a>添加客户</a>
  </shiro:hasRole>
  <shiro:hasRole name="客服">
      <a>查询客户</a>
      <a>添加客户</a>
  </shiro:hasRole>
  <hr>
  <c:forEach items="${menuList}" var="menu">
      <br>
      ${menu.menuname}<br>
     <c:forEach items="${menu.menu2}" var="menu">
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${menu.url}">${menu.menuname}</a>
     </c:forEach>
  </c:forEach>
</body>
</html>
