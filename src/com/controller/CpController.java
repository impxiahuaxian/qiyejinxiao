package com.controller;
/**
 * 产品数据 接收处理转发
 */

import com.pojo.Cp;
import com.service.CpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cp")
public class CpController {
    @Autowired
    private CpService cpService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Cp cp) {
        String method = request.getParameter("method");
        if(method.equals("addcp")){
            String mc=cp.getMc();
            String str = cpService.getSame(mc);
            if(str==null) {
                int flag = cpService.insertSelective(cp);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/cp/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/cp/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/cp/index";
            }
        }
        else {//修改
            String str = cpService.upgetSame(cp);
            if(str==null) {
                int flag = cpService.updateByPrimaryKeySelective(cp);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/cp/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/cp/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/cp/index";
            }
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = cpService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/cp/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/cp/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            cpService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/cp/index";
    }
}
