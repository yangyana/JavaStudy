package com.yyn.jichuyufa;

/**
 * Created By Administrator
 * Date: 2019/1/7
 * Time: 20:53
 */
public class AA {
    public String name;
    private int age;

    public AA() {
    }

    public AA(String name) {
        this.name = name;
    }

    public AA(int age) {
        this.age = age;
    }

    public AA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
