package com.nuc.edu.pojo;

public class User {

    public void a(){
        int i=10/0;
        System.out.println("---a----");
    }

    public void b(String z){

        System.out.println("---b----");
        int a=5/0;
    }


    public void c(){
        System.out.println("---c----");
    }
}
