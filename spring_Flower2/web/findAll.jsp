<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/6 0006
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>花信息</title>
</head>
<body>
    <table border="1px">
        <tr>
            <th>花卉编号</th>
            <th>花卉名称</th>
            <th>花卉价格</th>
            <th>花卉产地</th>
        </tr>

        <c:forEach items="${floList}" var="flo">
             <tr>
                 <th>${flo.id}</th>
                 <th>${flo.name}</th>
                 <th>${flo.price}</th>
                 <th>${flo.production}</th>
             </tr>
        </c:forEach>

    </table>
</body>
</html>
