<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/14 0014
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
  <form action="/ssm_email/user/login" method="post">
      <p>
          用户名：<input type="text" name="uname">
      </p>
      <p>
          密码：<input type="text" name="pwd">
      </p>
      <p>
          <input type="submit" name="提交">
      </p>

  </form>
</body>
</html>
