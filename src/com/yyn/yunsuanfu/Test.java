package com.yyn.yunsuanfu;

/**
 * Created By Administrator
 * Date: 2018/11/29
 * Time: 20:38
 */
public class Test {
    public static void main(String[] args) {
        int a = 1, b = 2;
        a = a + 2 * 2 - (1 + 1);//
        System.out.println("a = " + a + "  b = " + b);//a = 3  b = 2
        b = b + b / 3 + (a++) % 3;//
        System.out.println("a = " + a + "  b = " + b);//a = 4  b = 2
        b = b * 3 + (++a) % 3;//
        System.out.println("a = " + a + "  b = " + b);//a = 5  b = 8
        a = b-- + --b;//
        System.out.println("a = " + a + "  b = " + b);//a = 14  b = 6
        int c = a-- / 2 + --b % 3;
        // a,b,c 的 值 分别是多少？
        System.out.println("a = " + a + "  b = " + b + "  c = " + c);//a = 13  b = 5  c = 9
    }

}

