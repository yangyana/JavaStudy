package com.yyn.number;

/**
 * Created By Administrator
 * Date: 2018/12/7
 * Time: 21:35
 */
public class NumberTest {
    static int a;//类变量--基本数据类型 默认值为0
    static Integer b;//引用类型  默认值为null
    static Boolean c;
    static Float d;
    static String e;
    static int f = 1;
    static Integer j = 1;

    public static void main(String[] str) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("e=" + e);//
        System.out.println("f=" + f);//
        System.out.println("j=" + j);//
        System.out.println(f == j);//

        /*a = 0
        b = null
        c = null
        d = null
        e = null
        f = 1
        j = 1
        true*/

    }

}
