package com.yyn.test;

/**
 * Created By Administrator
 * Date: 2019/1/29
 * Time: 21:22
 */
public class Student {
    private String name;
    private String sex;

    public Student() {//无参构造方法

    }

    public Student(String name, String sex) { //有参构造方法
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}
