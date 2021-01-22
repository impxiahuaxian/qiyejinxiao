<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/login.css" />
</head>
<%
    String message = (String)request.getAttribute("message");
    if(message == null){
        message = "";
    }
    if (!message.trim().equals("")){
        out.println("<script language='javascript'>");
        out.println("alert('"+message+"');");
        out.println("</script>");
    }
    request.removeAttribute("message");
%>
<body>
<img class="bgone" src="<%=basePath%>admin/statics/images/1.jpg" />
<img class="pic" src="<%=basePath%>admin/statics/images/a.png" />
<form method="post" action="<%=basePath%>admin/adminLogin">
    <div class="table">
        <div class="wel">企业进销存管理系统</div>
        <div class="user">
            <div id="yonghu" style=""><img src="<%=basePath%>admin/statics/images/yhm.png" /></div>
            <input type="text" name="username" placeholder="账号" required/>
        </div>
        <div class="password">
            <div id="yonghu"><img src="<%=basePath%>admin/statics/images/mm.png" /></div>
            <input type="password" name="password" placeholder="密码" required/>
        </div>
        <div class="user2">
            <div id="yonghu" style=""><img src="<%=basePath%>admin/statics/images/yhm.png" /></div>
            <select name="sf" required>
                <option value="">身份</option>
                <option value="销售员">销售员</option>
                <option value="库管员">库管员</option>
                <option value="管理员">管理员</option>
            </select>
        </div>

        <input class="btn" type="submit" name="登录" value="登录" />
    </div>
</form>
</body>
</html>