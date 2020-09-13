package com.nuc.edu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Email implements Serializable {
    private int eid;
    private String etitle;
    private String econ;
    private String filename;
    private int recid;
    private int sendid;
    private Date edate;

    //用户名称属性
    private String uname;

    private User user;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEtitle() {
        return etitle;
    }

    public void setEtitle(String etitle) {
        this.etitle = etitle;
    }

    public String getEcon() {
        return econ;
    }

    public void setEcon(String econ) {
        this.econ = econ;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public int getSendid() {
        return sendid;
    }

    public void setSendid(int sendid) {
        this.sendid = sendid;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public Email(int eid, String etitle, String econ, String filename, int recid, int sendid, Date edate) {
        this.eid = eid;
        this.etitle = etitle;
        this.econ = econ;
        this.filename = filename;
        this.recid = recid;
        this.sendid = sendid;
        this.edate = edate;
    }

    public Email() {
    }

    @Override
    public String toString() {
        return "email{" +
                "eid=" + eid +
                ", etitle='" + etitle + '\'' +
                ", econ='" + econ + '\'' +
                ", filename='" + filename + '\'' +
                ", recid=" + recid +
                ", sendid=" + sendid +
                ", edate=" + edate +
                '}';
    }
}
