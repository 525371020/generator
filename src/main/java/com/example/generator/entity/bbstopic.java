package com.example.generator.entity;

import java.util.Date;

public class bbstopic {
    private Integer tid;

    private Integer tsid;

    private Integer tuid;

    private Integer temotion;

    private String thead;

    private String ttopic;

    private Date ttime;

    private Integer tclickcoount;

    private Integer tflag;

    private Integer topping;

    private Integer treplycount;

    private Integer tlastreplyuseid;

    private Date tlastreplaytime;

    private String tcontents;

    public bbstopic(Integer tid, Integer tsid, Integer tuid, Integer temotion, String thead, String ttopic, Date ttime, Integer tclickcoount, Integer tflag, Integer topping, Integer treplycount, Integer tlastreplyuseid, Date tlastreplaytime, String tcontents) {
        this.tid = tid;
        this.tsid = tsid;
        this.tuid = tuid;
        this.temotion = temotion;
        this.thead = thead;
        this.ttopic = ttopic;
        this.ttime = ttime;
        this.tclickcoount = tclickcoount;
        this.tflag = tflag;
        this.topping = topping;
        this.treplycount = treplycount;
        this.tlastreplyuseid = tlastreplyuseid;
        this.tlastreplaytime = tlastreplaytime;
        this.tcontents = tcontents;
    }

    public bbstopic() {
        super();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getTsid() {
        return tsid;
    }

    public void setTsid(Integer tsid) {
        this.tsid = tsid;
    }

    public Integer getTuid() {
        return tuid;
    }

    public void setTuid(Integer tuid) {
        this.tuid = tuid;
    }

    public Integer getTemotion() {
        return temotion;
    }

    public void setTemotion(Integer temotion) {
        this.temotion = temotion;
    }

    public String getThead() {
        return thead;
    }

    public void setThead(String thead) {
        this.thead = thead == null ? null : thead.trim();
    }

    public String getTtopic() {
        return ttopic;
    }

    public void setTtopic(String ttopic) {
        this.ttopic = ttopic == null ? null : ttopic.trim();
    }

    public Date getTtime() {
        return ttime;
    }

    public void setTtime(Date ttime) {
        this.ttime = ttime;
    }

    public Integer getTclickcoount() {
        return tclickcoount;
    }

    public void setTclickcoount(Integer tclickcoount) {
        this.tclickcoount = tclickcoount;
    }

    public Integer getTflag() {
        return tflag;
    }

    public void setTflag(Integer tflag) {
        this.tflag = tflag;
    }

    public Integer getTopping() {
        return topping;
    }

    public void setTopping(Integer topping) {
        this.topping = topping;
    }

    public Integer getTreplycount() {
        return treplycount;
    }

    public void setTreplycount(Integer treplycount) {
        this.treplycount = treplycount;
    }

    public Integer getTlastreplyuseid() {
        return tlastreplyuseid;
    }

    public void setTlastreplyuseid(Integer tlastreplyuseid) {
        this.tlastreplyuseid = tlastreplyuseid;
    }

    public Date getTlastreplaytime() {
        return tlastreplaytime;
    }

    public void setTlastreplaytime(Date tlastreplaytime) {
        this.tlastreplaytime = tlastreplaytime;
    }

    public String getTcontents() {
        return tcontents;
    }

    public void setTcontents(String tcontents) {
        this.tcontents = tcontents == null ? null : tcontents.trim();
    }
}