package com.nuc.edu.pojo;

import java.io.Serializable;

public class Admin implements Serializable {

    private   Integer  id;

    private   String  uname;

    private   String   pwd;

    private String salt;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Admin() {
    }
}
