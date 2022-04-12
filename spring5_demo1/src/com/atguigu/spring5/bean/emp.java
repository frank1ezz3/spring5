package com.atguigu.spring5.bean;

//员工类
public class emp {
    private String ename;
    private String gender;
    //员工输入某一个部门，使用对象形式表示(对象所属的属性)
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

    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }


}
