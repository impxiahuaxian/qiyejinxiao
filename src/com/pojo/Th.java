package com.pojo;

public class Th {
    private Integer id;

    private String ckbh;

    private String rkbh;

    private String mc;

    private String fl;

    private Float xsjg;

    private Integer sl;

    private Float thzj;

    private String sj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCkbh() {
        return ckbh;
    }

    public void setCkbh(String ckbh) {
        this.ckbh = ckbh == null ? null : ckbh.trim();
    }

    public String getRkbh() {
        return rkbh;
    }

    public void setRkbh(String rkbh) {
        this.rkbh = rkbh == null ? null : rkbh.trim();
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl == null ? null : fl.trim();
    }

    public Float getXsjg() {
        return xsjg;
    }

    public void setXsjg(Float xsjg) {
        this.xsjg = xsjg;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public Float getThzj() {
        return thzj;
    }

    public void setThzj(Float thzj) {
        this.thzj = thzj;
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj == null ? null : sj.trim();
    }
}