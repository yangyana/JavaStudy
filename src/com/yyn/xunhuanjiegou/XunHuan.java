package com.yyn.xunhuanjiegou;

/**
 * Created By Administrator
 * Date: 2018/12/2
 * Time: 21:37
 */
public class XunHuan {
    public static void main(String[] str) {
        for (int i = 1; i < 10; i++) {

            if (i == 8) {
                break;
            }
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }


        System.out.println("------------------------ 2");

        int a = 1;
        while (a < 8) {
            if (a != 5) {
                System.out.println(a);
            }
            a++;
        }
        System.out.println("------------------------ 3");

        a = 1;
        do {
            if(a!=5){
                System.out.println(a);
            }
            a++;
        }
        while (a < 8);


        System.out.println("------------------------");

        String[] numbers = {"yang", "ya", "na", "520"};
        for (String aaa : numbers) {   //增强型for循环
            System.out.println(aaa);
        }

        for (int j = 0; j < numbers.length; j++) {
            System.out.println("-----> " + numbers[j]);
        }
    }
}
