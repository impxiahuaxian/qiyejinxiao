<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
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
        String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        String method=request.getParameter("method");
        String id="";String rkbh="";String mc="";String fl="";String gy="";String kf="";String rkjg="";String sl="";String xsjg="";String sj=date;
        if(method.equals("uprk")){
            id=request.getParameter("id");
            List alist=cb.get1Com("select * from rk where id='"+id+"'",10);
            rkbh=alist.get(1).toString();
            mc=alist.get(2).toString();
            fl=alist.get(3).toString();
            gy=alist.get(4).toString();
            kf=alist.get(5).toString();
            rkjg=alist.get(6).toString();
            sl=alist.get(7).toString();
            xsjg=alist.get(8).toString();
            sj=alist.get(9).toString();
        }
%>
<body>
<div class="sort_style_add margin" id="sort_style_add" style="display:yes">
    <form method="post" action="<%=basePath%>rk/addMethod">
        <input type="hidden" name="method" value="<%=method%>" /><input type="hidden" name="id" value="<%=id%>"/>
        <div class="">
            <ul>
                <li><label class="label_name">入库编号：</label>
                    <div class="col-sm-9">
                        <input type="text" name="rkbh" value="<%=rkbh%>" class="col-xs-10 col-sm-5" required>
                    </div>
                </li>
                <li><label class="label_name">商品名称：</label>
                    <div class="col-sm-9">
                        <span class="formControls col-4">
                            <select class="form-control" name="mc" required>
                                <%if(method.equals("uprk")){%><option value="<%=mc%>"><%=mc%></option><%}%>
                                <option value="">请选择</option>
                                <%List cplist=cb.getCom("select * from cp order by id desc",2);if(!cplist.isEmpty()){for(int i=0;i<cplist.size();i++){List list2=(List)cplist.get(i);%>
                                    <option value=<%=list2.get(1).toString() %>><%=list2.get(1).toString() %></option>
                                <%}} %>
                           </select>
                        </span>
                    </div>
                </li>
                <li><label class="label_name">商品分类：</label>
                    <div class="col-sm-9">
                        <span class="formControls col-4">
                            <select class="form-control" name="fl" required>
                                <%if(method.equals("uprk")){%><option value="<%=fl%>"><%=fl%></option><%}%>
                                <option value="">请选择</option>
                                <%List flist=cb.getCom("select * from fl order by id desc",2);if(!flist.isEmpty()){for(int i=0;i<flist.size();i++){List list2=(List)flist.get(i);%>
                                    <option value=<%=list2.get(1).toString() %>><%=list2.get(1).toString() %></option>
                                <%}} %>
                           </select>
                        </span>
                    </div>
                </li>
                <li><label class="label_name">供应商：</label>
                    <div class="col-sm-9">
                        <span class="formControls col-4">
                            <select class="form-control" name="gy" required>
                                <%if(method.equals("uprk")){%><option value="<%=gy%>"><%=gy%></option><%}%>
                                <option value="">请选择</option>
                                <%List gylist=cb.getCom("select * from gy order by id desc",2);if(!gylist.isEmpty()){for(int i=0;i<gylist.size();i++){List list2=(List)gylist.get(i);%>
                                    <option value=<%=list2.get(1).toString() %>><%=list2.get(1).toString() %></option>
                                <%}} %>
                           </select>
                        </span>
                    </div>
                </li>
                <li><label class="label_name">存放库房：</label>
                    <div class="col-sm-9">
                        <input type="text" name="kf" value="<%=kf%>" class="col-xs-10 col-sm-5" required>
                    </div>
                </li>
                <li><label class="label_name">入库价格：</label>
                    <div class="col-sm-9">
                        <input type="number" min="1" step="0.1" name="rkjg" value="<%=rkjg%>" class="col-xs-10 col-sm-5" required>
                    </div>
                </li>
                <li><label class="label_name">入库数量：</label>
                    <div class="col-sm-9">
                        <input type="number"  min="1" name="sl" value="<%=sl%>" class="col-xs-10 col-sm-5" required>
                    </div>
                </li>
                <li><label class="label_name">销售价格：</label>
                    <div class="col-sm-9">
                        <input type="number" min="1" step="0.1" name="xsjg" value="<%=xsjg%>" class="col-xs-10 col-sm-5" required>
                    </div>
                </li>
                <li><label class="label_name">入库时间：</label>
                    <div class="col-sm-9">
                        <input type="date" name="sj" value="<%=sj%>" class="col-xs-10 col-sm-5" required>
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