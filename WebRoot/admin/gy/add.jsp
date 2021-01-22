<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="cb" scope="page" class="com.bean.ComBean" />
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
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
        String method=request.getParameter("method");
        String id="";String mc="";String dh="";String bz="";
        if(method.equals("upgy")){
            id=request.getParameter("id");
            List alist=cb.get1Com("select * from gy where id='"+id+"'",4);
            mc=alist.get(1).toString();
            dh=alist.get(2).toString();
            bz=alist.get(3).toString();
        }
%>
<body>
<div class="sort_style_add margin" id="sort_style_add" style="display:yes">
    <form method="post" action="<%=basePath%>gy/addMethod">
        <input type="hidden" name="method" value="<%=method%>" /><input type="hidden" name="id" value="<%=id%>"/>
        <div class="">
            <ul>
                <li><label class="label_name">供应商名：</label>
                    <div class="col-sm-9">
                        <input type="text" name="mc" value="<%=mc%>" class="col-xs-10 col-sm-5" required>
                    </div>
                </li>
                <li><label class="label_name">联系电话：</label>
                    <div class="col-sm-9">
                        <input type="text" name="dh" value="<%=dh%>" class="col-xs-10 col-sm-5" required>
                    </div>
                </li>
                <li><label class="label_name">备注信息：</label>
                    <div class="col-sm-9">
                        <input type="text" name="bz" value="<%=bz%>" class="col-xs-10 col-sm-5" required>
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