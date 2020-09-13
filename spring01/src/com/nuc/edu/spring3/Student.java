package com.nuc.edu.spring3;

public class Student implements People {
    public Student() {
        System.out.println("stu 对象被创建");
    }

    @Override
    public void eat() {
        System.out.println("stu吃的方法");
    }

    @Override
    public void run() {
        System.out.println("stu跑的方法");
    }
}
