<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/10 0010
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#aj").click(function () {
                $.post("demo2",{name:"sxt"},function (data1) {
                    alert(data1.name);
                })
            })

        })
    </script>
</head>
<body>
    <input type="button" value="ajax请求" id="aj">
</body>
</html>
