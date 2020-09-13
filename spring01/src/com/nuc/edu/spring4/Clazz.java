package com.nuc.edu.spring4;

public class Clazz {
    private int clazzno;
    private String cname;

    public Clazz(int clazzno, String cname) {
        this.clazzno = clazzno;
        this.cname = cname;
    }

    public Clazz() {
    }

    public int getClazzno() {
        return clazzno;
    }

    public void setClazzno(int clazzno) {
        this.clazzno = clazzno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }


    @Override
    public String toString() {
        return "Clazz{" +
                "clazzno=" + clazzno +
                ", cname='" + cname + '\'' +
                '}';
    }
}
