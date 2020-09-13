<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/10 0010
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
    <script type="text/javascript">
         //表单校验
         $(function () {
            $("#age").blur(function () {
                var reg = /^120$|^((1[0-1]|[1-9])?\d)$/;
                var age = $("#age").val();
                if(age == "") {
                    $("#age_span").html("年龄不能为空！").css("color","red");
                    return;
                } else if(!reg.test(age)) {
                    $("#age_span").html("年龄必须在0-120之间").css("color","red");
                    return;
                }
            })

         })
    </script>
</head>
<body>
     <form action="demo04" method="post">
         <p>
             用户名：<input type="text" name="uname"/>
         </p>
         <p>
             密码：<input type="text" name="pwd"/>
         </p>
         <p>
             年龄：<input type="text" name="age" id="age"/><span id="age_span"></span>
         </p>
         <p>
             出生日期：<input type="text" name="birthday"/>
         </p>
         <p>
             爱好：
             吃<input type="checkbox" name="hobby" value="chi"/>
             喝<input type="checkbox" name="hobby" value="he"/>
             玩<input type="checkbox" name="hobby" value="wan"/>
         </p>
         <p>
             <input type="submit" value="提交"/>
         </p>
     </form>
     <a href="demo05/www/123">删除</a>
</body>
</html>
