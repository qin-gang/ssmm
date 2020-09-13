package com.nuc.edu.proxy2;

public class Test1 {
    public static void main(String[] args) {
        MyInv my=new MyInv();

        //设置具体的房东
        my.setLetRoom(new FD2());

        //产生了中介的代理对象
        LetRoom proxy = (LetRoom) my.getProxy();
        proxy.zf();
        Util.writeProxyClassToHardDisk("E:/$Proxy11.class",new FD2().getClass().getInterfaces());
    }
}
