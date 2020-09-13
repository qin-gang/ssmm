package com.nuc.edu.proxy3;

public class Test1 {
    public static void main(String[] args) {
        MyMethodInv my=new MyMethodInv();
        FD proxy = (FD) my.getProxy();
        proxy.zf();
    }
}
