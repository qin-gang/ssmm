<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/8 0008
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>银行转账系统</title>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">
        var flag1=false;
        var flag2=false;
        var flag3=false;
        $(function () {
            //判断转账账号是否有效：ajax请求
           $("#pwd").blur(function () {
               var cno=$("#cno").val();
               var pwd=$("#pwd").val();
               $.post("account?method=checkUser",{cno:cno,pwd:pwd},function (data1) {
                    var data1 = eval(data1);
                    if (data1){
                        flag1=true;
                        $("#pwd_span").html("√ 汇款人信息正确").css("color","green");
                    }else{
                        $("#pwd_span").html("× 汇款人信息错误").css("color","red");
                    }

               })
           })

          //判断转账金额是否充足
          $("#money").blur(function () {
                var cno=$("#cno").val();
                var pwd=$("#pwd").val();
                var money = $("#money").val();
                $.post("account?method=checkUser",{cno:cno,pwd:pwd,money:money},function (data1) {
                    var data1 = eval(data1);
                    if (data1){
                        flag2=true;
                        $("#money_span").html("√ 汇款金额正确").css("color","green");
                    }else{
                        $("#money_span").html("× 汇款金额错误").css("color","red");
                    }
                })
            })

            //判断收款账户是否存在
            $("#cno2").blur(function () {
                var cno2=$("#cno2").val();
                var cno=$("#cno").val();
                if (cno==cno2){
                    alert("该账号和自己的账号一致！！！！");
                }else{
                    $.post("account?method=checkUser",{cno:cno2},function (data1) {
                        var data1 = eval(data1);
                        if (data1){
                            flag3=true;
                            $("#cno2_span").html("√ 收款人账户正确").css("color","green");
                        }else{
                            $("#cno2_span").html("× 收款人账户错误").css("color","red");
                        }
                    })
                }
            })

        })

        function change() {
            if (flag1&&flag2&&flag3){
                return true;
            }else{
                return false;
            }
        }
    </script>
</head>
<body>
   <h3>银行转账系统</h3>
   ${error}
   <form action="account?method=inOutMoney" method="post" onsubmit="return change()">
        <p>
            转账账号：<input type="text" id="cno" name="cno"/>
        </p>
        <p>
           转账密码：<input type="text" id="pwd"/><span id="pwd_span"></span>
        </p>
        <p>
           转账金额：<input type="text" id="money" name="money"/><span id="money_span"></span>
        </p>
        <p>
           收款账号：<input type="text" id="cno2" name="cno2"/><span id="cno2_span"></span>
        </p>
       <p>
           <input type="submit" value="确认转账"/>
       </p>
   </form>
</body>
</html>
