<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/14 0014
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>登录成功界面</title>
</head>
<body>
   <table border="1px">
       <tr>
           <th>标题</th>
           <th>时间</th>
           <th>发送人</th>
       </tr>
       <c:forEach items="${list}" var="em">
           <tr>
               <th>${em.etitle}</th>
               <th><fmt:formatDate value="${em.edate}" pattern="yyyy-MM-dd"></fmt:formatDate></th>
               <th>${em.uname}</th>
           </tr>
       </c:forEach>
   </table>
   <%--根路径--%>
   <a href="/ssm_email/emailSend.jsp">发送邮件1</a>
   <%--相对路径  相对于当前地址栏信息--%>
   <a href="../emailSend.jsp">发送邮件2</a>
   <%--绝对路径--%>
   <a href="http://localhost:8080/ssm_email/emailSend.jsp">发送邮件3</a>
</body>
</html>
