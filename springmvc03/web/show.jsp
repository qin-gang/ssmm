<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/12 0012
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
   <form action="file" method="post" enctype="multipart/form-data">
       <%--
            必须注意：
              A、提交方式：post
              B、enctype="multipart/form-data"  二进制流
       --%>
       <h3>用户添加</h3>
       <p>
           用户名：<input type="text" name="uname">${error}
       </p>
       <p>
           分数：<input type="text" name="score">
       </p>
       <p>
           年龄：<input type="text" name="age">
       </p>
       <p>
           文件：<input type="file" name="fi">
       </p>

       <p>
          <input type="submit" value="提交">
       </p>
   </form>
</body>
</html>
