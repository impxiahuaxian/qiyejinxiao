package com.controller;
/**
 * 出库数据接收 处理转发
 */

import com.bean.ComBean;
import com.pojo.Ck;
import com.pojo.Rk;
import com.service.CkService;
import com.service.RkService;
import com.service.ThService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/ck")
public class CkController {
    @Autowired
    private CkService ckService;
    private RkService rkService;
    private ThService thService;

    public CkController(RkService rkService, ThService thService) {
        this.rkService = rkService;
        this.thService = thService;
    }

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Ck ck) {
        Rk rk = rkService.selectByBh(ck.getRkbh());
        ComBean cb=new ComBean();
        int rksl=cb.getCount("select sl from rk where rkbh='"+ck.getRkbh()+"'");
        int cksl=cb.getCount("select sum(sl) from ck where rkbh='"+ck.getRkbh()+"'");
        int rtsl=cb.getCount("select sum(sl) from rt where rkbh='"+ck.getRkbh()+"'");
        int thsl=cb.getCount("select sum(sl) from th where rkbh='"+ck.getRkbh()+"'");
        int kc=rksl-cksl-rtsl+thsl;
        String str=cb.getString("select id from ck where ckbh='"+ck.getCkbh()+"'");
        if(str==null){
            if(kc>=ck.getSl()){
                ck.setMc(rk.getMc());
                ck.setFl(rk.getFl());
                ck.setRkjg(rk.getRkjg());
                ck.setXsjg(rk.getXsjg());
                float xszj = ck.getSl()*rk.getXsjg();
                float rkzj = ck.getSl()*rk.getRkjg();
                float lr = xszj-rkzj;
                ck.setXszj(xszj);
                ck.setLr(lr);
                int flag = ckService.insertSelective(ck);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/ck/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/ck/index";
                }
            }
            else{
                request.setAttribute("message", "库存不足！");
                return "admin/ck/add";
            }
        }
        else{
            request.setAttribute("message", "信息重复！");
            return "admin/ck/add";
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = ckService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/ck/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/ck/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            ckService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/ck/index";
    }
}
