package com.atguigu.spring5;

/**
 * Created by lilin on 2020/10/29/0029.
 */
public class Book {
    private String bname;
    private String bauthor;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
    public void testBook()
    {
        System.out.println(bname+"  "+bauthor);
    }
}
