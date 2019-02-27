package com.yyn.test;

/**
 * Created By Administrator
 * Date: 2019/1/29
 * Time: 21:21
 */
public class XunHuanTest {
    public static void main(String[] str) {
//        //
//        Student s1 = new Student("小花", "男");
//        Student s2 = new Student("小花媳妇", "女");
//        Student[] stuArr = {s1, s2};
//
//        // 用两种for循环，打印 数组stuArr 中学生的名字和性别
//        for (int i = 0; i < stuArr.length; i++) {
//            System.out.println(stuArr[i]);// stuArr[i] 数据里面取值
//
//            String name = stuArr[i].getName();
//            String sex = stuArr[i].getSex();
//            System.out.println(name + "---->" + sex);
//
//        }
//
//        for (Student aaa : stuArr) {
////            String name = aaa.getName();
////            String sex = aaa.getSex();
////            System.out.println(name + "---->" + sex);
//
//            System.out.println(aaa.getName() + "---->" + aaa.getSex());
//
//        }
//
//        //  输出0-10；
//        方法一：
//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//
//        }

        int i = 0;
        while (i <= 10) {
            // 最后一次循环时 i = 10
            System.out.println(i);
            i = i + 1;
        }

        i = -1;
        while (i < 10) {
            // 最后一次循环时 i = 9
            i = i + 1;
            System.out.println(i);
        }

        // 打印 10-0
        System.out.println(" 打印 10-0");
        for (int j = 10; j >= 0; j--) {
            System.out.println(j);
        }

        // 数组的 正序和倒序打印

    }
}
