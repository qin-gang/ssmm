<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/6 0006
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加花卉信息</title>
</head>
<body>
  <form action="flowerSave" method="post">
      ${error}
      <p>
          花卉名称：<input type="text" name="name">
      </p>
      <p>
          花卉价格：<input type="text" name="price">
      </p>
      <p>
          花卉产地：<input type="text" name="production">
      </p>
      <p>
          <input type="submit" value="提交">
      </p>
  </form>

</body>
</html>
