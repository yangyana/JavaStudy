package com.yyn.jichuyufa;

import com.yyn.jichuyufa.AA;

/**
 * Created By Administrator
 * Date: 2019/1/7
 * Time: 20:50
 */
public class AATest {
    public static void main(String[] str) {
        AA a = new AA();
        System.out.println("name = " + a.name + "  age = " + a.getAge());
        a = new AA("小媳妇", 18);
        System.out.println("name = " + a.name + "  age = " + a.getAge());
        a.setName("杨雅娜小媳妇");
        a.setAge(17);
        System.out.println("name = " + a.name + "  age = " + a.getAge());

//        name = null  age = 0
//        name = 小媳妇  age = 18
//        name = 杨雅娜小媳妇  age = 17

    }
}
