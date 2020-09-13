<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/12 0012
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        th{width: 90px}
    </style>
</head>
<body>
<table border="1px" align="center">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>分数</th>
        <th>图片</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <th>${stu.id}</th>
            <th>${stu.name}</th>
            <th>${stu.score}</th>
            <th><img src="/springmvc03/upload/${stu.photoname}" height="80px"></th>
            <th><a href="fileDown?photoname=${stu.photoname}&phototype=${stu.phototype}">下载</a></th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
