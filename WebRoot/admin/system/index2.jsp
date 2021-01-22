<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="cb" scope="page" class="com.bean.ComBean" />
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="<%=basePath%>admin/statics/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/css/style.css"/>
    <link rel="stylesheet" href="<%=basePath%>admin/statics/assets/css/ace.min.css" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/font/css/font-awesome.min.css" />
    <script src="<%=basePath%>admin/statics/js/jquery-1.4.4.min.js" type="text/javascript"></script>
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

    String username=(String)session.getAttribute("user");
    if(username==null){
        response.sendRedirect(path+"index.jsp");
    }
    else{
        String usernam="";String password="";String realname="";String sex="";String age="";String address="";String tel="";
        List alist=cb.get1Com("select * from admin where username='"+username+"'",9);
        realname=alist.get(3).toString();
        sex=alist.get(4).toString();
        age=alist.get(5).toString();
        tel=alist.get(6).toString();
        address=alist.get(7).toString();
%>
<body>
<div class="sort_style_add margin" id="sort_style_add" style="display:yes">
    <form method="post" action="<%=basePath%>admin/adminupdateByUsername">
        <div class="">
            <ul>
                <li><label class="label_name">姓名：</label>
                    <div class="col-sm-9">
                        <input type="text" name="realname" value="<%=realname%>" class="col-xs-10 col-sm-5" required>
                    </div>
                </li>
                <li><label class="label_name">性别：</label>
                    <div class="col-sm-9">
                        <span class="add_content"> &nbsp;&nbsp;<label>
                          <input name="sex" type="radio" checked="checked" class="ace"><span class="lbl">男</span></label>&nbsp;&nbsp;&nbsp;
                          <label><input name="sex" type="radio" class="ace"><span class="lbl">女</span></label>
                        </span>
                    </div>
                </li>
                <li><label class="label_name">年龄：</label>
                    <div class="col-sm-9">
                        <input type="number" min="18" max="100" name="age" value="<%=age%>" class="col-xs-10 col-sm-5" required>
                    </div>
                </li>
                <li><label class="label_name">电话：</label>
                    <div class="col-sm-9">
                        <input type="text" name="tel" value="<%=tel%>" pattern="[0-9]{11}" title="11位手机号码" class="col-xs-10 col-sm-5" required>
                    </div>
                </li>
                <li><label class="label_name">备注信息：</label>
                    <div class="col-sm-9">
                        <textarea name="address" class="form-control" id="form-field-8" required><%=address%></textarea>
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