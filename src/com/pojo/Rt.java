package com.pojo;

public class Rt {
    private Integer id;

    private String rkbh;

    private Integer sl;

    private String yy;

    private String sj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRkbh() {
        return rkbh;
    }

    public void setRkbh(String rkbh) {
        this.rkbh = rkbh == null ? null : rkbh.trim();
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public String getYy() {
        return yy;
    }

    public void setYy(String yy) {
        this.yy = yy == null ? null : yy.trim();
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj == null ? null : sj.trim();
    }
}