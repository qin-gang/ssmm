<%@ page import="com.nuc.edu.pojo.Users" %>
<%@ page import="java.util.List" %>
<%@ page import="com.nuc.edu.pojo.Menus" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/20 0020
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <SCRIPT language=javascript src="/rbac/js/dtree/dtree.js"></SCRIPT>
    <script type="text/javascript" src="/rbac/js/java-like.util.js"></script>
    <link rel="stylesheet" href="/rbac/js/dtree/dtree.css" type="text/css">
</head>
<body>
<form action="" name="form1" method=POST>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td rowspan="5" width="1" bgcolor="CCCCCC"></td>
            <td bgcolor="CCCCCC" height="1"></td>
            <td rowspan="4" bgcolor="CCCCCC" width="1"></td>
        </tr>

        <tr>
            <td bgcolor="E3E7FF" align="center" height="5"></td>
        </tr>

        <tr>
            <td bgcolor="CCCCCC" height="1"></td>
        </tr>

        <tr>
            <td bgcolor="F9F9F9" align="center" valign="top">
                <table width="90%" border="0" align="center" cellpadding="1" cellspacing="1" bgcolor="F5F5F5">
                    <tr bgcolor="F3F9FF">
                        <td bgcolor="F5F5F5">
                            <SCRIPT LANGUAGE="JavaScript">
                                d = new dTree('d');
                                d.config.target = "body";
                                d.config.imageDir = "/rbac/js/dtree/img";
                                d.reSetImagePath();
                                d.config.folderLinks = false;
                                d.config.closeSameLevel =true;
                                var isOpen ;
                                //根节点
                                <%
                                    Users user = (Users)session.getAttribute("user");
                                    List menus = user.getMenus();
                                    for(int i=0;i<menus.size();i++){
                                        Menus menu = (Menus)menus.get(i);
                                %>
                                   d.add(<%=menu.getMenuid() %>, <%=menu.getFatherid() %>, '<%=menu.getMenuname() %>', '/rbac/jsp/<%=menu.getMenuurl() %>', '', 'body');
                                <%}%>
                                document.write(d);
                            </script>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>

        <tr>
            <td background="/rbac/images/jao1.gif" colspan="2" align="right"><img
                    src="/rbac/images/jao.gif" width="8" height="8"></td>
        </tr>

    </table>
</form>
</body>
</html>
