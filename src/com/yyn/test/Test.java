package com.yyn.test;

/**
 * Created By Administrator
 * Date: 2019/1/25
 * Time: 21:50
 */
public class Test {
    public static void main(String[] str) {
        // 把0-100内 所有能整除3和5的数打印出来
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }

        }

    }
}
