package com.yyn.number;

/**
 * Created By Administrator
 * Date: 2018/12/7
 * Time: 22:01
 */
public class MathTest {
    public static void main(String[] str) {
        double a = -520.1314;
        double b=1314.520;
        System.out.println("Math.abs(a)="+Math.abs(a));//绝对值
        System.out.println("Math.ceil(a)="+Math.ceil(a));//向左取整
        System.out.println("Math.floor(a)="+Math.floor(a));//向右取整
        System.out.println("Math.rint(a)="+Math.rint(a));//返回最近的整数
        System.out.println("Math.min(a,b)="+Math.min(a, b));//最小值
        System.out.println("Math.max(a,b)="+Math.max(a, b));//最大值
        System.out.println("Math.random()="+Math.random());//返回随机数(0-1)之间的小数
        System.out.println("Math.random()="+Math.random());
        /*
        Math.abs(a)=520.1314
        Math.ceil(a)=-520.0
        Math.floor(a)=-521.0
        Math.rint(a)=-520.0
        Math.min(a,b)=-520.1314
        Math.max(a,b)=1314.52
        Math.random()=0.11577012415210708
        Math.random()=0.014521070007103343
        */


    }
}