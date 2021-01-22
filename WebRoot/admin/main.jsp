<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
    <link rel="stylesheet" href="<%=basePath%>admin/statics/assets/css/font-awesome.min.css" />
    <script src="<%=basePath%>admin/statics/assets/js/jquery.min.js"></script>
    <script src="<%=basePath%>admin/statics/assets/js/bootstrap.min.js"></script>
</head>
<body>
<div class="page-content clearfix">
    <div class="alert alert-block alert-success">
        <button type="button" class="close" data-dismiss="alert"><i class="icon-remove"></i></button>
        <i class="icon-ok green"></i>欢迎使用<strong class="green">本系统</strong>
    </div>
    <div class="state-overview clearfix">
        <div class="col-lg-3 col-sm-6">
            <section class="panel">
                <a href="#" >
                    <div class="symbol terques">
                        <i class="icon-user"></i>
                    </div>
                    <div class="value">
                        <h1><%=cb.getCount("select count(*) from gy")%></h1>
                        <p>供应商</p>
                    </div>
                </a>
            </section>
        </div>
        <div class="col-lg-3 col-sm-6">
            <section class="panel">
                <div class="symbol red">
                    <i class="icon-tags"></i>
                </div>
                <div class="value">
                    <h1><%=cb.getCount("select count(*) from fl")%></h1>
                    <p>分类</p>
                </div>
            </section>
        </div>
        <div class="col-lg-3 col-sm-6">
            <section class="panel">
                <div class="symbol yellow">
                    <i class="icon-shopping-cart"></i>
                </div>
                <div class="value">
                    <h1><%=cb.getCount("select count(*) from cp")%></h1>
                    <p>商品</p>
                </div>
            </section>
        </div>
        <div class="col-lg-3 col-sm-6">
            <section class="panel">
                <div class="symbol blue">
                    <i class="icon-bar-chart"></i>
                </div>
                <div class="value">
                    <h1><%=cb.getCount("select count(*) from kf")%></h1>
                    <p>客户</p>
                </div>
            </section>
        </div>
    </div><center>关于  <a href="http://www.baidu.com/" target="_blank">访问技术网站</a> </center>
</body>
</html>
