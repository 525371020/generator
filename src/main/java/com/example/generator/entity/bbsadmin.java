package com.example.generator.entity;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

public class bbsadmin implements Serializable {
    private Integer aid;

    private String aname;

    private String apassword;

    private Integer asex;

    private Date atime;

    public bbsadmin(Integer aid, String aname, String apassword, Integer asex, Date atime) {
        this.aid = aid;
        this.aname = aname;
        this.apassword = apassword;
        this.asex = asex;
        this.atime = atime;
    }

    public bbsadmin() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword == null ? null : apassword.trim();
    }

    public Integer getAsex() {
        return asex;
    }

    public void setAsex(Integer asex) {
        this.asex = asex;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }
}