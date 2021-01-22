package com.controller;
/**
 * 接收管理用户页面请求，处理和转发
 */

import com.pojo.Admin;
import com.service.AdminService;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    //String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    @Autowired
    private AdminService adminService;

    @RequestMapping("/toLogin")
    public String toLogin(HttpServletRequest request,Model model) {
        request.removeAttribute("message");
        HttpSession session = request.getSession();
        String user = (String)session.getAttribute("user");
        if(user==null){
            return "index";
        }
        else{
            return "admin/index";
        }
    }
    @RequestMapping("/addAdmin") //增加用户
    public String addMethod(HttpServletRequest request, Admin admin) {
        String method = request.getParameter("method");
        if(method.equals("addm")){
            String username=admin.getUsername();
            String str = adminService.getSame(username);
            if(str==null) {
                admin.setAddtime(date);
                int flag = adminService.insertSelective(admin);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/system/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/system/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/system/index";
            }
        }
        else {//修改用户
            String str = adminService.upgetSame(admin);
            if(str==null) {
                admin.setAddtime(date);
                int flag = adminService.updateByPrimaryKeySelective(admin);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/system/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/system/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/system/index";
            }
        }
    }
    @RequestMapping("/updateAdmin") //修改用户
    public String updateMethod(HttpServletRequest request, Admin admin) {
        String str = adminService.upgetSame(admin);
        if(str==null) {
            int flag = adminService.updateByPrimaryKey(admin);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/system/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/system/index";
            }
        }
        else{
            request.setAttribute("message", "信息重复！");
            return "allPaper";
        }
    }

    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request,@PathVariable("id") int id) {
        int flag = adminService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/system/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/system/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            adminService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/system/index";
    }

    @RequestMapping("adminLogin") //管理用户登录
    public String adminLogin(HttpServletRequest request, Admin admin) {
        HttpSession session = request.getSession();

            List<Admin> list = adminService.adminLogin(admin);
            if(list.size()>0){
                session.setAttribute("user",admin.getUsername());
                session.setAttribute("sf",admin.getSf());
                return "admin/index";
            }
            else{
                request.setAttribute("message", "登录信息错误！");
                return "index";
            }
    }

    @RequestMapping("/adminupdateByUsername") //用户修改个人信息
    public String adminupdateByUsername(HttpServletRequest request, Admin admin) {
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("user");
        admin.setUsername(username);
        int flag = adminService.adminupdateByUsername(admin);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/system/index2";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/system/index2";
        }
    }

    @RequestMapping("/adminupPwd") //用户修改密码
    public String adminupPwd(HttpServletRequest request,Admin admin) {
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("user");
        String oldpwd = request.getParameter("oldpwd");
        String newpwd = request.getParameter("newpwd");
        admin.setUsername(username);
        admin.setPassword(oldpwd);
        List<Admin> list = adminService.admincheckPwd(admin);
        if(list.size()>0){
            admin.setPassword(newpwd);
            int flag = adminService.adminupPwd(admin);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/system/pwd";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/system/pwd";
            }
        }
        else{
            request.setAttribute("message", "原始密码错误！");
            return "admin/system/pwd";
        }
    }
    @RequestMapping("/adminExit") //退出登录
    public String adminExit(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        session.removeAttribute("sf");
        return "index";
    }
}