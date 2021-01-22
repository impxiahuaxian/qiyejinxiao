package com.controller;
/**
 * 接收库房信息页面数据 处理 转发
 */
import com.pojo.Kf;
import com.service.KfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/kf")
public class KfController {
    @Autowired
    private KfService kfService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Kf kf) {
        String method = request.getParameter("method");
        if(method.equals("addkf")){
            String mc=kf.getMc();
            String str = kfService.getSame(mc);
            if(str==null) {
                int flag = kfService.insertSelective(kf);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/kf/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/kf/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/kf/index";
            }
        }
        else {//修改
            String str = kfService.upgetSame(kf);
            if(str==null) {
                int flag = kfService.updateByPrimaryKeySelective(kf);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/kf/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/kf/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/kf/index";
            }
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = kfService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/kf/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/kf/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            kfService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/kf/index";
    }
}
