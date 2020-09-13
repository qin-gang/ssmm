<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/27 0027
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="/ssm_shiro_login/js/jquery-1.9.1.js"></script>
    <script type="text/javascript">
       $(function () {
          $.post("findAll",{},function (data) {
              var html="";
              for (var i=0;i<data.length;i++){
                  html +="<li>"+data[i].uname+"&nbsp;&nbsp;&nbsp;"+data[i].realPwd+"</li>";
              }
              $("#uspan").html(html);
          })
       })
    </script>
</head>
<body>
  <div>
      <tr>
          <th>用户名</th>
          <th>密码</th>
      </tr>
      <span id="uspan"></span>
  </div>
</body>
</html>
