
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
    <h3><font color="red">${requestScope.msg}</font> </h3>
    <form action="/rbac/Clogin/userlogin" method="post">
         用户名：<input type="text" name="userName">
         密码：<input type="password" name="userPwd">
         <input type="submit" value="提交">
    </form>
</body>
</html>
