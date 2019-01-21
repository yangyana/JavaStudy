package com.yyn.demo;

/**
 * Created By Administrator
 * Date: 2018/11/16
 * Time: 21:40
 */
public class Array {
    public static void main(String[] args) {

        String[] strArray;
        strArray = new String[10];
        strArray[0] = "杨雅娜小可爱";
        strArray[0] = "杨雅娜小可爱2";
        strArray[1] = "杨雅娜小可爱3";

        System.out.println(strArray[0]);
        System.out.println(strArray[1]);
        System.out.println(strArray[2]);
        System.out.println(strArray[9]);

        String[] strArray2 = new String[10];
        strArray2[0] = "2杨雅娜小可爱";
        strArray2[1] = "2杨雅娜小可爱3";

        System.out.println(strArray2[0]);
        System.out.println(strArray2[1]);
        System.out.println(strArray2[9]);

        String[] strArray3 = {"3杨雅娜小可爱", "aaaa"};

        System.out.println(strArray3[0]);
        System.out.println(strArray3[1]);

        String[] strArray4 = new String[]{"4杨雅娜小可爱", "4aaaa"};

        System.out.println(strArray4[0]);
        System.out.println(strArray4[1]);


        int[] intArray = new int[7];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        System.out.println(intArray[2]);
        System.out.println(intArray[3]);

        double[] doubleArray = new double[]{120.22, 133.2};

        System.out.println(doubleArray[0]);

        boolean[] booleanArray = {true, false,true,true};

        System.out.println(booleanArray[0]);
        System.out.println(booleanArray.length);

//        booleanArray 的长度 = 2
        String str=  "booleanArray 的长度 = "+booleanArray.length;

        System.out.println(str);
    }
}
