package com.atguigu.spring5;

/**
 * Created by lilin on 2020/10/29/0029.
 */
public class Orders {
    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public  void testOrders() {
        System.out.println(oname+"  "+address);
    }
}
