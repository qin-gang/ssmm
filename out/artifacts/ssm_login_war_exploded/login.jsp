<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/7 0007
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <form action="login.do" method="post">
       <p>
           用户名：<input name="uname" type="text"/>${error}
       </p>
       <p>
           密码：<input name="pwd" type="text"/>
       </p>
       <p>
           用户名：<input value="提交" type="submit"/>
       </p>
   </form>
</body>
</html>
