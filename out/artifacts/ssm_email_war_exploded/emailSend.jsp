<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/14 0014
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发送邮件</title>
</head>
<body>
  <h3>邮件发送</h3>
  <form action="/ssm_email/EmailCon/send" method="post" enctype="multipart/form-data">
      <p>
          收件人:<input type="text" name="recid">
      </p>
      <p>
          主题:<input type="text" name="etitle">
      </p>
      <p>
          正文:<input type="text" name="econ">
      </p>
      <p>
          附件:<input type="file" name="fi">
      </p>

      <p>
          提交:<input type="submit" value="提交">
      </p>
  </form>
</body>
</html>
