package com.controller;
/**
 * 入库数据 接收处理转发
 */
import com.pojo.Rk;
import com.service.RkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/rk")
public class RkController {
    @Autowired
    private RkService rkService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Rk rk) {
        String method = request.getParameter("method");
        if(method.equals("addrk")){
            String rkbh=rk.getRkbh();
            String str = rkService.getSame(rkbh);
            if(str==null) {
                int flag = rkService.insertSelective(rk);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/rk/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/rk/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/rk/index";
            }
        }
        else {//修改
            String str = rkService.upgetSame(rk);
            if(str==null) {
                int flag = rkService.updateByPrimaryKeySelective(rk);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/rk/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/rk/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/rk/index";
            }
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = rkService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/rk/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/rk/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            rkService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/rk/index";
    }
}
