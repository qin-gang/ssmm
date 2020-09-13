package com.nuc.edu.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private String realname;
    private double score;
    private String photoname;
    private String phototype;

    public Student() {
    }

    public Student(int id, String name, int age, String realname, double score, String photoname, String phototype) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.realname = realname;
        this.score = score;
        this.photoname = photoname;
        this.phototype = phototype;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname;
    }

    public String getPhototype() {
        return phototype;
    }

    public void setPhototype(String phototype) {
        this.phototype = phototype;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", realname='" + realname + '\'' +
                ", score=" + score +
                ", photoname='" + photoname + '\'' +
                ", phototype='" + phototype + '\'' +
                '}';
    }
}
