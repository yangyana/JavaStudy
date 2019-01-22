package com.yyn.jibenshujuleixing;

/**
 * Created By Administrator
 * Date: 2018/11/13
 * Time: 21:02
 */
public class JiBenShuJuLeiXing {
    static String putaogan = "1";
    static int asd;

    public static void main(String[] args) {
        System.out.println("5201314");
        System.out.println(asd);
        String putaogan = "2";
        System.out.println(putaogan);
        byte aa = 126;
        byte aa2 = 2;
        Byte aa3 = 126;
        String aa5 = "12";
        byte aa6 = 0;
        try {
            aa6 = Byte.parseByte(aa5);
            aa6 = 99;
        } catch (NumberFormatException e) {
            System.out.println("捕捉到异常了");
            aa6 = 100;
//            e.printStackTrace();
        }


        System.out.println(aa);
        System.out.println(aa2);
        System.out.println(aa + aa2);
        System.out.println("Byte aa3 = " + aa3);
        System.out.println("Byte 最小值 = " + Byte.MIN_VALUE);
        System.out.println("Byte 最大值 = " + Byte.MAX_VALUE);
        System.out.println("aa6+aa6=" + (aa6 + aa6));


        short b;
        short bb = 100;
        System.out.println("Short 最小值 = " + Short.MIN_VALUE);
        System.out.println("Short 最大值 = " + Short.MAX_VALUE);
        Short aaShort = Short.parseShort(aa5);
        System.out.println("aaShort+aaShort=" + (aaShort + aaShort));

        int c;
        int cc = 10000;
        System.out.println(cc);
        int aaInt = Integer.parseInt(aa5);
        System.out.println("aaInt+aaInt=" + (aaInt + aaInt));
        float ccc = (float) cc;
        System.out.println("10000 装转成 float 类型 =  " + ccc);

        long d = 100000;
        long aaLong = Long.parseLong(aa5);
        System.out.println("aaLong+aaLong=" + (aaLong + aaLong));
        aa5 = "12.1314";

        float e = 3.14f;
        float ee = 3.15f;
        float aaFloat = Float.parseFloat(aa5);
        System.out.println("aaFloat+aaFloat=" + (aaFloat + aaFloat));
        int eee = (int) e;
        System.out.println("3.14 装转成 int 类型 =  " + eee);

        System.out.println(e);
        System.out.println(e + ee);

        double f = 11.1;
        double aaDouble = Double.parseDouble(aa5);
        System.out.println("aaDouble+aaDouble=" + (aaDouble + aaDouble));

        char q;
        char qq = '数';
        System.out.println(qq);
//Character

        boolean z;
        boolean zz = false;
        System.out.println(zz);
        boolean z3 = Boolean.parseBoolean("false aa");
        System.out.println(z3);
        if (z3) {
            System.out.println("--->true");

        } else {
            System.out.println("------->false");

        }

        // +-*/
        int bbb = 1;
        byte ddd = 2;
        System.out.println(bbb / ddd);
        System.out.println(bbb != 1);
        String cn = "yyz";
        System.out.println(cn.equals("yyZ"));
        System.out.println(cn.equalsIgnoreCase("yyZ"));

        float ss = 1.5f;
        double xx = 2;
        System.out.println(ss / xx);

    }
}
