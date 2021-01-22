<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="cb" scope="page" class="com.bean.ComBean" />
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="<%=basePath%>admin/statics/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/css/style.css"/>
    <link rel="stylesheet" href="<%=basePath%>admin/statics/assets/css/ace.min.css" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/font/css/font-awesome.min.css" />
    <script src="<%=basePath%>admin/statics/js/jquery-1.4.4.min.js" type="text/javascript"></script>
</head>
<script language="javascript" >
    function top2(){
        form3.action="<%=basePath%>admin/rt/index.jsp?page=1";
        form3.submit();
    }
    function last2(){
        if(form3.pageCount.value==0){//如果总页数为0，那么最后一页为1，也就是第一页，而不是第0页
            form3.action="<%=basePath%>admin/rt/index.jsp?page=1";
            form3.submit();
        }else{
            form3.action="<%=basePath%>admin/rt/index.jsp?page="+form3.pageCount.value;
            form3.submit();
        }
    }
    function pre2(){
        var page=parseInt(form3.page.value);
        if(page<=1){
            alert("已至第一页");
        }else{
            form3.action="<%=basePath%>admin/rt/index.jsp?page="+(page-1);
            form3.submit();
        }
    }

    function next2(){
        var page=parseInt(form3.page.value);
        var pageCount=parseInt(form3.pageCount.value);
        if(page>=pageCount){
            alert("已至最后一页");
        }else{
            form3.action="<%=basePath%>admin/rt/index.jsp?page="+(page+1);
            form3.submit();
        }
    }
    function bjump2(){
        var pageCount=parseInt(form3.pageCount.value);
        if( fIsNumber(form3.busjump.value,"1234567890")!=1 ){
            alert("跳转文本框中只能输入数字!");
            form3.busjump.select();
            form3.busjump.focus();
            return false;
        }
        if(form3.busjump.value>pageCount){//如果跳转文本框中输入的页数超过最后一页的数，则跳到最后一页
            if(pageCount==0){
                form3.action="<%=basePath%>admin/rt/index.jsp?page=1";
                form3.submit();
            }
            else{
                form3.action="<%=basePath%>admin/rt/index.jsp?page="+pageCount;
                form3.submit();
            }
        }
        else if(form3.busjump.value<=pageCount){
            var page=parseInt(form3.busjump.value);
            if(page==0){
                page=1;//如果你输入的是0，那么就让它等于1
                form3.action="<%=basePath%>admin/rt/index.jsp?page="+page;
                form3.submit();
            }else{
                form3.action="<%=basePath%>admin/rt/index.jsp?page="+page;
                form3.submit();
            }

        }

    }
    //****判断是否是Number.
    function fIsNumber (sV,sR){
        var sTmp;
        if(sV.length==0){ return (false);}
        for (var i=0; i < sV.length; i++){
            sTmp= sV.substring (i, i+1);
            if (sR.indexOf (sTmp, 0)==-1) {return (false);}
        }
        return (true);
    }
</script>
<script type="text/javascript">
    function checkchoose()
    {
        if($("input[name='chk_list']").is(':checked')) {
            form1.submit();
        }
        else{
            alert("请至少选择一项！");
        }
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
%>
<body>
<div class="page-content clearfix">
    <div class="sort_style">
        <form name="sform" method="post" action="<%=basePath%>admin/rt/sinfo.jsp">
            <div class="search_style">
                <ul class="search_content clearfix">
                    <li><label class="l_f">编号</label><input name="rkbh" type="text"  class="text_add" style=" width:250px"/></li>
                    <li style="width:90px;"><button type="submit" class="btn_search"><i class="icon-search"></i>查询</button></li>
                </ul>
            </div>
        </form>
        <div class="border clearfix">
       <span class="l_f">
        <a href="<%=basePath%>admin/rt/add.jsp?method=addrt" class="btn btn-warning"><i class="fa fa-plus"></i> 添加</a>
        <a onclick="checkchoose()" class="btn btn-danger"><i class="fa fa-trash"></i> 批量删除</a>
       </span>
        </div>
        <div class="sort_list">
            <form action="<%=basePath%>rt/batchDel" method="post" name="form1">
            <table class="table table-striped table-bordered table-hover" id="sample-table">
                <thead>
                <tr>
                    <th width="25px"><label><input type="checkbox" name="chk_all" id="chk_all" class="ace"><span class="lbl"></span></label></th>
                    <th width="50px">ID</th>
                    <th>入库编号</th>
                    <th>退货数量</th>
                    <th>退货原因</th>
                    <th>时间</th>
                    <th width="110px">操作</th>
                </tr>
                </thead>
                <script type="text/javascript">
                    $("#chk_all").click(function(){
                        $("input[name='chk_list']").attr("checked",$(this).attr("checked"));
                    });
                </script>
                <tbody>
                <%
                    cb.setEVERYPAGENUM(10);
                    int cou = cb.getMessageCount("select count(*) from rt");//得到信息总数
                    String page1=request.getParameter("page");
                    if(page1==null){
                        page1="1";
                    }
                    session.setAttribute("busMessageCount", cou + "");
                    session.setAttribute("busPage", page1);
                    List pagelist1 = cb.getMessage(Integer.parseInt(page1),"select * from rt order by id desc",5);
                    session.setAttribute("qqq", pagelist1);
                    int pageCount = cb.getPageCount(); //得到页数
                    session.setAttribute("busPageCount", pageCount + "");
                    List pagelist3=(ArrayList)session.getAttribute("qqq");
                    if(!pagelist3.isEmpty()){
                        for(int i=0;i<pagelist3.size();i++){
                            List pagelist2 =(ArrayList)pagelist3.get(i);
                %>
                <tr>
                    <td><label><input type="checkbox" name="chk_list" id="chk_list_<%=i%>" value="<%=pagelist2.get(0).toString()%>" class="ace"><span class="lbl"></span></label></td>
                    <td><%=i+1%></td>
                    <td><%=pagelist2.get(1).toString() %></td>
                    <td><%=pagelist2.get(2).toString() %></td>
                    <td><%=pagelist2.get(3).toString() %></td>
                    <td><%=pagelist2.get(4).toString() %></td>
                    <td width="110px">
                        <a title="删除" onclick="if (confirm('确定要删除吗？')) return true; else return false;" href="<%=basePath%>rt/del/<%=pagelist2.get(0).toString()%>" class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i></a>
                    </td>
                </tr>
                <%}}%>
                </tbody>
            </table>
            </form>
        </div>
    </div>
</div>
<% if(cou>0){ %>
<center>
    <form action="" method="post" name="form3">
        <input type="hidden" name="pageCount" value="<%= session.getAttribute("busPageCount").toString()%>" /><!--//用于给上面javascript传值-->
        <input type="hidden" name="page" value="<%=session.getAttribute("busPage").toString()%>" /><!--//用于给上面javascript传值-->
        <a href="#" onClick="top2()">&lt;&lt;</a>&nbsp;&nbsp;&nbsp;
        <a href="#" onClick="pre2()">&lt;</a>&nbsp;&nbsp;&nbsp;
        共<%=session.getAttribute("busMessageCount").toString()%>条&nbsp;&nbsp;<%=session.getAttribute("busPageCount").toString()%>页
        &nbsp;&nbsp;第<%=session.getAttribute("busPage").toString()%>页&nbsp;&nbsp;&nbsp;
        <a href="#" onClick="next2()">&gt;</a>&nbsp;&nbsp;&nbsp;
        <a href="#" onClick="last2()">&gt;&gt;</a>&nbsp;&nbsp;&nbsp;
        第&nbsp;<input name="busjump" type="text" style="width:35px; height:20px;border: 1px solid gray;"/>&nbsp;页&nbsp;
        <a href="#" onClick="bjump2()">&nbsp;确定</a>
    </form>
</center>
<% } %>
</body>
</html>