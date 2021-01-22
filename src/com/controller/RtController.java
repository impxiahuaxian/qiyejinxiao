package com.controller;

import com.bean.ComBean;
import com.pojo.Ck;
import com.pojo.Rk;
import com.pojo.Rt;
import com.service.RtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/rt")
public class RtController {
    @Autowired
    private RtService rtService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Rt rt) {
        ComBean cb=new ComBean();
        int rksl=cb.getCount("select sl from rk where rkbh='"+rt.getRkbh()+"'");
        int cksl=cb.getCount("select sum(sl) from ck where rkbh='"+rt.getRkbh()+"'");
        int rtsl=cb.getCount("select sum(sl) from rt where rkbh='"+rt.getRkbh()+"'");
        int thsl=cb.getCount("select sum(sl) from th where rkbh='"+rt.getRkbh()+"'");
        int kc=rksl-cksl-rtsl+thsl;
        if(kc>=rt.getSl()){
            int flag = rtService.insertSelective(rt);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/rt/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/rt/index";
            }
        }
        else{
            request.setAttribute("message", "库存不足！");
            return "admin/rt/add";
        }
    }

    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = rtService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/rt/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/rt/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            rtService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/rt/index";
    }
}