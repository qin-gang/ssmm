<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/27 0027
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="saveUser" method="post">
      <p>
          用户名： <input type="text" name="uname">
      </p>
      <p>
          密码： <input type="text" name="upwd">
      </p>
      <p>
          角色编号： <input type="text" name="rid">
      </p>
      <p>
          提交： <input type="submit" value="提交">
      </p>
  </form>
</body>
</html>
