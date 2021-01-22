package com.controller;
/**
 * 销售退货数据接收处理转发
 */

import com.pojo.Ck;
import com.pojo.Th;
import com.service.CkService;
import com.service.ThService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/th")
public class ThController {
    @Autowired
    private ThService thService;
    private CkService ckService;

    public ThController(CkService ckService) {
        this.ckService = ckService;
    }

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Th th) {
        Ck ck = ckService.selectByBh(th.getCkbh());
        if(ck!=null){
            int cksl = ck.getSl();
            int thsl = 0;
            String thtmp = thService.selectSlbyCkbh(th.getCkbh());
            if(thtmp!=null){
                thsl = Integer.parseInt(thtmp);
            }
            if((cksl-thsl)>=th.getSl()){
                th.setRkbh(ck.getRkbh());
                th.setMc(ck.getMc());
                th.setFl(ck.getFl());
                th.setXsjg(ck.getXsjg());
                th.setThzj(ck.getXsjg()*th.getSl());
                int flag = thService.insertSelective(th);
                if(flag == 1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/th/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/th/index";
                }
            }
            else{
                request.setAttribute("message", "出库："+cksl+",已退货："+thsl+"，本次退货："+th.getSl()+"，退货数量大于出库数量！");
                return "admin/th/index";
            }
        }
        else{
            request.setAttribute("message", "无此编号！");
            return "admin/th/index";
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = thService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/th/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/th/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            thService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/th/index";
    }
}
