package com.controller;
/**
 * 接收处理转发供应商页面数据
 */

import com.pojo.Gy;
import com.service.GyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/gy")
public class GyController {
    @Autowired
    private GyService gyService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Gy gy) {
        String method = request.getParameter("method");
        if(method.equals("addgy")){
            String mc=gy.getMc();
            String str = gyService.getSame(mc);
            if(str==null) {
                int flag = gyService.insertSelective(gy);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/gy/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/gy/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/gy/index";
            }
        }
        else {//修改
            String str = gyService.upgetSame(gy);
            if(str==null) {
                int flag = gyService.updateByPrimaryKeySelective(gy);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/gy/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/gy/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/gy/index";
            }
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = gyService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/gy/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/gy/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            gyService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/gy/index";
    }
}
