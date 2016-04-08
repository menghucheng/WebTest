<%--
  Created by IntelliJ IDEA.
  User: MENGHUCHENG012
  Date: 2016/4/7
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":"
            +request.getServerPort() + path +"/";;
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <link rel="stylesheet" href="<%=basePath%>/js/plugins/bootstrap-3.3.5/css/bootstrap.min.css">
    <script src="<%=basePath%>/js/plugins/jquery-2.1.4/jquery.min.js"></script>
    <script src="<%=basePath%>/js/plugins/bootstrap-3.3.5/js/bootstrap.min.js"></script>
    <title>testweb 首页</title>


    <style type="text/css">
        body{
            background : url("<%=basePath%>/images/1.jpg");
            background-size: cover;
        }
    </style>
</head>
<body>
<h1>This is return by Controller!</h1>
<hr/>
<div class="show">
    <h1>Hello, world!</h1>
    <p>...</p>
    <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
</div>

<div>
    <h2>表格</h2>
    <table class="table table-hover">
        <tr>
           <th>1</th>
           <th>2</th>
           <th>3</th>
        </tr>
        <tr>
            <td>第A项</td>
            <td>第B项</td>
            <td>第C项</td>
        </tr>
        <tr>
            <td>第一项</td>
            <td>第二项</td>
            <td>第三项</td>
        </tr>
        <tr>
            <td>第1项</td>
            <td>第2项</td>
            <td>第3项</td>
        </tr>
    </table>
</div>
</body>
</html>
