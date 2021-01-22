package com.controller;
/**
 * 接收分类信息页面数据 处理 转发
 */

import com.pojo.Fl;
import com.service.FlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/fl")
public class FlController {
    @Autowired
    private FlService flService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Fl fl) {
        String method = request.getParameter("method");
        if(method.equals("addfl")){
            String mc=fl.getMc();
            String str = flService.getSame(mc);
            if(str==null) {
                int flag = flService.insertSelective(fl);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/fl/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/fl/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/fl/index";
            }
        }
        else {//修改
            String str = flService.upgetSame(fl);
            if(str==null) {
                int flag = flService.updateByPrimaryKeySelective(fl);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/fl/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/fl/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/fl/index";
            }
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = flService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/fl/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/fl/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            flService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/fl/index";
    }
}
