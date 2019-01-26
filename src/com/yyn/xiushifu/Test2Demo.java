package com.yyn.xiushifu;

/**
 * Created By Administrator
 * Date: 2019/1/25
 * Time: 21:39
 */
public class Test2Demo {
    public static void main(String[] str) {
        Test2 test2 = new Test2();
        System.out.println("test2.aaa = " + test2.aaa);//0
        System.out.println("test2.getAaa() = " + test2.getAaa());//0

        System.out.println("test2.bbb = " + test2.bbb);//0
        System.out.println("test2.getBbb() = " + test2.getBbb());//0

        System.out.println("test2.getCcc() = " + test2.getCcc());//0

        test2.setAaa(11);
        System.out.println("test2.getAaa() = " + test2.getAaa());//11
        test2.aaa = 12;//对象点属性  访问属性
        System.out.println("test2.getAaa() = " + test2.getAaa());//12

        test2.setCcc(100);
        System.out.println("test2.getCcc() = " + test2.getCcc());//100

    }

/**
 一个类里面public和protected修饰的属性可以通过这个类的实例点这个属性，
 如：test2.aaa，来访问这个属性；
 private修饰的属性只能通过对应的set、get方法来访问，如：test2.setCcc(100);

 **/
}