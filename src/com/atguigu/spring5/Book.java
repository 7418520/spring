package com.atguigu.spring5;

/**
 * Created by lilin on 2020/10/29/0029.
 */
public class Book {
    private String bname;
    private String bauthor;
    private String address;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
    public void testBook()
    {
        System.out.println(bname+"  "+bauthor+"  "+address);
    }
}
