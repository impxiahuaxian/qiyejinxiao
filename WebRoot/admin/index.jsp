<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="<%=basePath%>admin/statics/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/assets/css/font-awesome.min.css" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/assets/css/ace.min.css" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/assets/css/ace-rtl.min.css" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/assets/css/ace-skins.min.css" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/css/style.css"/>
    <script src="<%=basePath%>admin/statics/assets/js/ace-extra.min.js"></script>
    <script src="<%=basePath%>admin/statics/js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        if("ontouchend" in document) document.write("<script src='<%=basePath%>admin/statics/assets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
    </script>
    <script src="<%=basePath%>admin/statics/assets/js/bootstrap.min.js"></script>
    <script src="<%=basePath%>admin/statics/assets/js/typeahead-bs2.min.js"></script>
    <script src="<%=basePath%>admin/statics/assets/js/ace-elements.min.js"></script>
    <script src="<%=basePath%>admin/statics/assets/js/ace.min.js"></script>
    <script src="<%=basePath%>admin/statics/assets/layer/layer.js" type="text/javascript"></script>
    <script src="<%=basePath%>admin/statics/assets/laydate/laydate.js" type="text/javascript"></script>
    <script src="<%=basePath%>admin/statics/js/jquery.nicescroll.js" type="text/javascript"></script>

    <script type="text/javascript">
        jQuery(document).ready(function(){
            $.each($(".submenu"),function(){
                var $aobjs=$(this).children("li");
                var rowCount=$aobjs.size();
                var divHeigth=$(this).height();
                $aobjs.height(divHeigth/rowCount);
            });
            //初始化宽度、高度

            $("#main-container").height($(window).height()-76);
            $("#iframe").height($(window).height()-140);

            $(".sidebar").height($(window).height()-99);
            var thisHeight = $("#nav_list").height($(window).outerHeight()-173);
            $(".submenu").height();
            $("#nav_list").children(".submenu").css("height",thisHeight);

            //当文档窗口发生改变时 触发
            $(window).resize(function(){
                $("#main-container").height($(window).height()-76);
                $("#iframe").height($(window).height()-140);
                $(".sidebar").height($(window).height()-99);

                var thisHeight = $("#nav_list").height($(window).outerHeight()-173);
                $(".submenu").height();
                $("#nav_list").children(".submenu").css("height",thisHeight);
            });
            $(document).on('click','.iframeurl',function(){
                var cid = $(this).attr("name");
                var cname = $(this).attr("title");
                $("#iframe").attr("src",cid).ready();
                $("#Bcrumbs").attr("href",cid).ready();
                $(".Current_page a").attr('href',cid).ready();
                $(".Current_page").attr('name',cid);
                $(".Current_page").html(cname).css({"color":"#333333","cursor":"default"}).ready();
                $("#parentIframe").html('<span class="parentIframe iframeurl"> </span>').css("display","none").ready();
                $("#parentIfour").html(''). css("display","none").ready();
            });
        });

        /*********************点击事件*********************/
        $( document).ready(function(){
            $('#nav_list,.link_cz').find('li.home').on('click',function(){
                $('#nav_list,.link_cz').find('li.home').removeClass('active');
                $(this).addClass('active');
            });
//时间设置
            function currentTime(){
                var d=new Date(),str='';
                str+=d.getFullYear()+'年';
                str+=d.getMonth() + 1+'月';
                str+=d.getDate()+'日';
                str+=d.getHours()+'时';
                str+=d.getMinutes()+'分';
                str+= d.getSeconds()+'秒';
                return str;
            }
            setInterval(function(){$('#time').html(currentTime)},1000);
        });
    </script>
</head>
<%
    String user=(String)session.getAttribute("user");String sf=(String)session.getAttribute("sf");
    if(user==null){
        response.sendRedirect(basePath+"index.jsp");
    }else{
%>
<body>
<div class="navbar navbar-default" id="navbar">
    <script type="text/javascript">
        try{ace.settings.check('navbar' , 'fixed')}catch(e){}
    </script>
    <div class="navbar-container" id="navbar-container">
        <div class="navbar-header pull-left">
            <a href="#" class="navbar-brand">
                <small>
                    <img src="<%=basePath%>admin/statics/images/logo.png" width="470px">
                </small>
            </a><!-- /.brand -->
        </div><!-- /.navbar-header -->
        <div class="navbar-header operating pull-left">	</div>
        <div class="navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">
                <li class="light-blue">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                        <span  class="time"><em id="time"></em></span><span class="user-info"><small><%=user%></small>身份：<%=sf%></span>
                        <i class="icon-caret-down"></i>
                    </a>
                    <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <li><a href="javascript:void(0)" name="<%=basePath%>admin/system/index2.jsp" class="iframeurl"><i class="icon-user"></i>个人资料</a></li>
                        <li><a href="javascript:void(0)" name="<%=basePath%>admin/system/pwd.jsp" class="iframeurl"><i class="icon-cog"></i>修改密码</a></li>
                        <li class="divider"></li>
                        <li><a onclick="if (confirm('确定要退出吗？')) return true; else return false;" href="<%=basePath%>admin/adminExit"><i class="icon-off"></i>退出</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="main-container" id="main-container">
    <script type="text/javascript">
        try{ace.settings.check('main-container' , 'fixed')}catch(e){}
    </script>
    <div class="main-container-inner">
        <a class="menu-toggler" id="menu-toggler" href="#">
            <span class="menu-text"></span>
        </a>
        <div class="sidebar" id="sidebar">
            <script type="text/javascript">
                try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
            </script>
            <div id="menu_style" class="menu_style">
                <ul class="nav nav-list" id="nav_list">
                    <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/main.jsp" class="iframeurl" title=""><i class="icon-home"></i><span class="menu-text"> 系统首页 </span></a></li>
                    <li>
                        <a href="#" class="dropdown-toggle"><i class="icon-cogs"></i><span class="menu-text"> 用户信息管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a  href="javascript:void(0)" name="<%=basePath%>admin/system/index2.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>用户信息管理</a></li>
                            <li class="home"><a  href="javascript:void(0)" name="<%=basePath%>admin/system/pwd.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>登录密码管理</a></li>
                        </ul>
                    </li>
            <%if(sf.equals("管理员")){%>
                    <li>
                        <a href="#" class="dropdown-toggle"><i class="icon-group"></i><span class="menu-text"> 工作人员管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/system/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>工作人员管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/system/add.jsp?method=addm" class="iframeurl"><i class="icon-double-angle-right"></i>增加工作人员</a></li>
                        </ul>
                    </li>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-bookmark"></i><span class="menu-text"> 分类信息管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a  href="javascript:void(0)" name="<%=basePath%>admin/fl/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>分类信息管理</a></li>
                            <li class="home"><a  href="javascript:void(0)" name="<%=basePath%>admin/fl/add.jsp?method=addfl" class="iframeurl"><i class="icon-double-angle-right"></i>增加分类信息</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#" class="dropdown-toggle"><i class="icon-picture "></i><span class="menu-text"> 客户信息管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a  href="javascript:void(0)" name="<%=basePath%>admin/kf/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>客户信息管理</a></li>
                            <li class="home"><a  href="javascript:void(0)" name="<%=basePath%>admin/kf/add.jsp?method=addkf" class="iframeurl"><i class="icon-double-angle-right"></i>增加客户信息</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#" class="dropdown-toggle"><i class="icon-user"></i><span class="menu-text"> 供应商管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/gy/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>供应商管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/gy/add.jsp?method=addgy" class="iframeurl"><i class="icon-double-angle-right"></i>增加供应商</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#" class="dropdown-toggle"><i class="icon-list"></i><span class="menu-text"> 商品信息管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/cp/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>商品信息管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/cp/add.jsp?method=addcp" class="iframeurl"><i class="icon-double-angle-right"></i>增加商品信息</a></li>
                        </ul>
                    </li>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-comments-alt"></i><span class="menu-text"> 采购入库管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/rk/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>采购入库管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/rk/add.jsp?method=addrk" class="iframeurl"><i class="icon-double-angle-right"></i>增加采购入库</a></li>
                        </ul>
                    </li>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-comments-alt"></i><span class="menu-text"> 入库退货管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/rt/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>入库退货管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/rt/add.jsp?method=addrt" class="iframeurl"><i class="icon-double-angle-right"></i>增加入库退货</a></li>
                        </ul>
                    </li>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-comments-alt"></i><span class="menu-text"> 销售出库管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/ck/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>销售出库管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/ck/add.jsp?method=addck" class="iframeurl"><i class="icon-double-angle-right"></i>增加销售出库</a></li>
                        </ul>
                    </li>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-comments-alt"></i><span class="menu-text"> 销售退货管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/th/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>销售退货管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/th/add.jsp?method=addth" class="iframeurl"><i class="icon-double-angle-right"></i>增加销售退货</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#" class="dropdown-toggle"><i class="icon-credit-card"></i><span class="menu-text"> 库存信息统计 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/kc/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>库存信息查看</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/kc/t.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>库存信息统计</a></li>
                        </ul>
                    </li>
                    <%}else if(sf.equals("库管员")){%>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-comments-alt"></i><span class="menu-text"> 采购入库管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/rk/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>采购入库管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/rk/add.jsp?method=addrk" class="iframeurl"><i class="icon-double-angle-right"></i>增加采购入库</a></li>
                        </ul>
                    </li>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-comments-alt"></i><span class="menu-text"> 入库退货管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/rt/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>入库退货管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/rt/add.jsp?method=addrt" class="iframeurl"><i class="icon-double-angle-right"></i>增加入库退货</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#" class="dropdown-toggle"><i class="icon-credit-card"></i><span class="menu-text"> 库存信息统计 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/kc/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>库存信息查看</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/kc/t.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>库存信息统计</a></li>
                        </ul>
                    </li>
                    <%}else{%>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-comments-alt"></i><span class="menu-text"> 销售出库管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/ck/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>销售出库管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/ck/add.jsp?method=addck" class="iframeurl"><i class="icon-double-angle-right"></i>增加销售出库</a></li>
                        </ul>
                    </li>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-comments-alt"></i><span class="menu-text"> 销售退货管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/th/index.jsp" class="iframeurl"><i class="icon-double-angle-right"></i>销售退货管理</a></li>
                            <li class="home"><a href="javascript:void(0)" name="<%=basePath%>admin/th/add.jsp?method=addth" class="iframeurl"><i class="icon-double-angle-right"></i>增加销售退货</a></li>
                        </ul>
                    </li>
                    <%}%>
                </ul>
            </div>
            <script type="text/javascript">
                $("#menu_style").niceScroll({
                    cursorcolor:"#888888",
                    cursoropacitymax:1,
                    touchbehavior:false,
                    cursorwidth:"5px",
                    cursorborder:"0",
                    cursorborderradius:"5px"
                });
            </script>
            <div class="sidebar-collapse" id="sidebar-collapse">
                <i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
            </div>
            <script type="text/javascript">
                try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
            </script>
        </div>

        <div class="main-content">
            <script type="text/javascript">
                try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
            </script>
            <div class="breadcrumbs" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li>
                        <i class="icon-home home-icon"></i>
                        <a href="<%=basePath%>admin/index.jsp">首页</a>
                    </li>
                    <li class="active"><span class="Current_page iframeurl"></span></li>
                    <li class="active" id="parentIframe"><span class="parentIframe iframeurl"></span></li>
                    <li class="active" id="parentIfour"><span class="parentIfour iframeurl"></span></li>
                </ul>
            </div>

            <iframe id="iframe" style="border:0; width:100%; background-color:#FFF;"name="iframe" frameborder="0" src="<%=basePath%>admin/main.jsp">  </iframe>


            <!-- /.page-content -->
        </div><!-- /.main-content -->

        <div class="ace-settings-container" id="ace-settings-container">
            <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
                <i class="icon-cog bigger-150"></i>
            </div>

            <div class="ace-settings-box" id="ace-settings-box">
                <div>
                    <div class="pull-left">
                        <select id="skin-colorpicker" class="hide">
                            <option data-skin="default" value="#438EB9">#438EB9</option>
                            <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                            <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                            <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                        </select>
                    </div>
                    <span>&nbsp; 选择皮肤</span>
                </div>

                <div>
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
                    <label class="lbl" for="ace-settings-sidebar"> 固定滑动条</label>
                </div>

                <div>
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
                    <label class="lbl" for="ace-settings-rtl">切换到左边</label>
                </div>

                <div>
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
                    <label class="lbl" for="ace-settings-add-container">
                        切换窄屏
                        <b></b>
                    </label>
                </div>
            </div>
        </div><!-- /#ace-settings-container -->
    </div><!-- /.main-container-inner -->

</div>
<!--底部样式-->

<div class="footer_style" id="footerstyle">
    <script type="text/javascript">try{ace.settings.check('footerstyle' , 'fixed')}catch(e){}</script>
    <p class="l_f">欢迎使用</p>
    <p class="r_f">管理系统</p>
</div>
</body>
<%}%>
</html>