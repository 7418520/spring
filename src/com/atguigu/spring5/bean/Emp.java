package com.atguigu.spring5.bean;

/**
 * Created by lilin on 2020/10/29/0029.
 */
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void add()
    {
        System.out.println(ename+"  "+gender+"  "+dept);
    }
}
