package com.yyn.shuzu;

import java.util.Arrays;

/**
 * Created By Administrator
 * Date: 2018/12/20
 * Time: 21:37
 */
public class ShuZuTest {
    public static void main(String[] arr) {
        int[] str = {1, 12, 33, 24, 5};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);

        }

        for (int a : str) {
            System.out.println("---->" + a);
        }

        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum = sum + str[i];
        }
        System.out.println("sum = " + sum);

        int min = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i] < min) {
                min = str[i];

            }
        }
        System.out.println("min =" + min);


        String[] b = {"小花是小狗", "aaa", "欺负我"};
        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);

        }
        double[] a = new double[]{32.22, 11, 3.3};
        str(new double[]{1.11, 1.12});
        resultArr(a);

        //public static void sort(Object[] a)
        // 对指定对象数组根据其元素的自然顺序进行升序排列。
        // 同样的方法适用于所有的其他基本数据类型（Byte，short，Int等）。
        Arrays.sort(a);
        for (double aa : a) {
            System.out.println("--->" + aa);
//                    --->3.3
//                    --->110.0
//                    --->322.2

        }


    }

    //数组作为方法的参数
    static void str(double[] arr) {
        if (arr != null) {
            for (double b : arr) {
                System.out.println(b);

            }
        }

    }

    //数组作为函数的参数,并且又返回一个数组
    static double[] resultArr(double[] max) {
        if (max != null) {
            for (int i = 0; i < max.length - 1; i++) {
                max[i] = 10 * max[i];
                System.out.println(max[i]);//max[i]-->数组当前位置的值
            }
        }
        return max;

    }


}
