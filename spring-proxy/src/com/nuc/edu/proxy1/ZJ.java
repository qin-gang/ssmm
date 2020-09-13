package com.nuc.edu.proxy1;

public class ZJ implements LetRoom {
    private int money;

    public ZJ(int money) {
        this.money = money;
    }
    @Override
    public void zf() {
        System.out.println("----收取推荐费50元------");

        if (money<=800){
            FD fd=new FD();
            fd.zf();
        }else if(money<2000&&money>800){
            FD2 fd2=new FD2();
            fd2.zf();
        }

        System.out.println("-----收取管理费30元---------");
    }
}
