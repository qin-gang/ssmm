package com.nuc.edu.spring3;

public class Factory {

    //工厂设计模式
    public People getInstance(String param){
        if ("stu".equals(param)){
            return new Student();
        }else if ("tea".equals(param)){
            return new Teacher();
        }
        return null;
    }

    public static People getInstance2(String param){
        if ("stu".equals(param)){
            return new Student();
        }else if ("tea".equals(param)){
            return new Teacher();
        }
        return null;
    }
}
