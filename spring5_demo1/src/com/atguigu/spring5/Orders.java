package com.atguigu.spring5;

public class Orders {
    private String oname;
    private String address;
    //创建有参数的构造

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void orderTest(){
        System.out.println(oname+":" +address);
    }
}
