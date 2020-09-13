package com.nuc.edu.spring3;

public class Teacher implements People{

    public Teacher(){
        System.out.println("teacher 对象被创建");
    }
    @Override
    public void eat() {
        System.out.println("teacher 吃的方法");
    }

    @Override
    public void run() {
        System.out.println("teacher 跑的方法");
    }
}
