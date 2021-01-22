<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="cb" scope="page" class="com.bean.ComBean" />
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="<%=basePath%>admin/statics/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/css/style.css"/>
    <link rel="stylesheet" href="<%=basePath%>admin/statics/assets/css/ace.min.css" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/font/css/font-awesome.min.css" />
    <script src="<%=basePath%>admin/statics/js/jquery-1.4.4.min.js" type="text/javascript"></script>
</head>
<script type="text/javascript">
    function checkPasswords() {
        var pass1 = document.getElementById("newpwd");
        var pass2 = document.getElementById("repwd");

        if (pass2.value != pass1.value)
            pass2.setCustomValidity("两次输入的密码不匹配");
        else
            pass2.setCustomValidity("");
    }
</script>
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

    String username=(String)session.getAttribute("user");
    if(username==null){
        response.sendRedirect(path+"index.jsp");
    }
    else{
%>
<body>
<div class="sort_style_add margin" id="sort_style_add" style="display:yes">
    <form method="post" action="<%=basePath%>admin/adminupPwd">
    <div class="">
        <ul>
            <li><label class="label_name">旧密码：</label>
                <div class="col-sm-9">
                    <input type="password" name="oldpwd" id="oldpwd" class="col-xs-10 col-sm-5" required>
                </div>
            </li>
            <li><label class="label_name">新密码：</label>
                <div class="col-sm-9">
                    <input type="password" name="newpwd" id="newpwd" class="col-xs-10 col-sm-5" required>
                </div>
            </li>
            <li><label class="label_name">确认密码：</label>
                <div class="col-sm-9">
                    <input type="password" name="repwd" id="repwd" onchange="checkPasswords()" class="col-xs-10 col-sm-5" required>
                </div>
            </li>
        </ul>
        <div class="Button_operation">
            <button class="btn btn-primary radius" type="submit">确定提交</button>
        </div>
    </div>
</form>
</div>
</body>
<%} %>
</html>