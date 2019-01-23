package com.yyn.bianliangleixing;

/**
 * Created By Administrator
 * Date: 2018/11/13
 * Time: 21:02
 */
public class JiBenShuJuLeiXing2 {
    public static final int ABC = 100;
    private int ABC1 = 101;
    protected static int ABC2 = 102;


    static final int aaa = 520;

    byte byteA0;// 实例变量
    public byte byteA00;// 实例变量
    public static byte byteA;// 类变量
    static Byte byteB = 0;// 类变量
    static Byte byteC;// 类变量
    static short shortA;// 类变量
    static int intA;// 类变量
    static long longA;// 类变量
    static float floatA;// 类变量
    static double doubleA;// 类变量
    static boolean booleanA;// 类变量
    static Boolean booleanB;// 类变量

    public static void main(String[] args) {
        System.out.println("byteA = " + byteA);
        System.out.println("byteB = " + byteB);
        System.out.println("byteC = " + byteC);
        System.out.println("shortA = " + shortA);
        System.out.println("intA = " + intA);
        System.out.println("longA = " + longA);
        System.out.println("floatA = " + floatA);
        System.out.println("doubleA = " + doubleA);
        System.out.println("booleanA = " + booleanA);
        System.out.println("booleanB = " + booleanB);

        /**
         byteA = 0
         byteB = 0
         byteC = null
         shortA = 0
         intA = 0
         longA = 0
         floatA = 0.0
         doubleA = 0.0
         booleanA = false
         * */

        byte byteA = 1;// 局部变量
        System.out.println("局部变量 byteA = " + byteA);

    }
}
