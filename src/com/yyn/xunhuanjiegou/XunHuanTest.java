package com.yyn.xunhuanjiegou;

/**
 * Created by 小北的小贝壳 on 2019/2/24.
 */
public class XunHuanTest {
    public static void main(String[] str) {
        int[] numbers = {10, 20, 30, 40, 50};
        //1.使用两种for循环打印数组里面的值
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }

        for (int aa : numbers) {

            System.out.println(aa);

        }

        //2.打印数组里面的值，不打印第三个值；
        for (int i = 0; i < numbers.length; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(numbers[i]);
        }

        //打印数组前三个值，使用break;
        for (int i = 0; i < numbers.length; i++) {

            if (i == 3) {
                break;
            }
            System.out.println(numbers[i]);

        }
    }
}
