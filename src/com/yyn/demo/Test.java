package com.yyn.demo;

/**
 * Created By Administrator
 * Date: 2018/11/29
 * Time: 20:38
 */
public class Test {
    public static void main(String[] args) {
        int a = 2, b = ++a + a--;
        System.out.println("a = " + a + "  b = " + b);//a =   b =
        a = a * 2 - b--;//
        System.out.println("a = " + a + "  b = " + b);//a =   b =
        b = ++b / 3 + ++a % 3;//
        System.out.println("a = " + a + "  b = " + b);//a =   b =
        b = b++ + ++b - (a++) - (--a);//
        System.out.println("a = " + a + "  b = " + b);//a =   b =
        a = a-- + --a - (b--) - (++b);//
        System.out.println("a = " + a + "  b = " + b);//a =   b =
        int c = a-- / 2 + --b % 2;

        // a,b,c 的 值 分别是多少？
        System.out.println("a = " + a + "  b = " + b + "  c = " + c);//a =   b =   c =
    }

}

