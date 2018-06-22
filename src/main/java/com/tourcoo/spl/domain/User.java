package com.tourcoo.spl.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String pwd;
    private String phone;

    @JsonFormat(pattern = "yyyy-mm-dd hh:MM:SS")
    private Date born;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }
}
