package com.yyn.yunsuanfu;

/**
 * Created By Administrator
 * Date: 2018/11/27
 * Time: 21:25
 */
public class SuanShu {
    public static void main(String[] args) {

        int a = 12;
        int c = 12;
        int b = 11;
        System.out.println("a=" + a + "     b=" + b);
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));

        System.out.println("a%b=" + (a % b));
        System.out.println("a++=" + (a++));//  "a++="+a; a=a+1;
        System.out.println("++c=" + (++c));// c=c+1; "++c="+c;
//        System.out.println("a--="+(a--));
        b++;// b=b+1
        System.out.println("b=" + b);
        ++b;// b=b+1
        System.out.println("-->b=" + b);

        int d = 8;
        System.out.println("d++=" + (d++)); //    "d++="+d;   d=d+1;     d++=8;
        System.out.println("++d=" + (++d));//    d=d+1;     "++d="+d;  ++d=10;
        System.out.println("d--=" + (d--));//    "d--="+d;   d=d-1;     d--=10;
        System.out.println("--d=" + (--d));//    d=d-1;     "--d="+d;  --d=8;                   --d=8;


        int e = 5, f = 6;
        e = e * f;//e=30
        System.out.println("1-->e = " + e + "  f = " + f);
        f = (e++) * 2;//f=60 e=31
        System.out.println("2-->e = " + e + "  f = " + f);
        f = (++e) * 2;// e=32 f =64
        System.out.println("3-->e = " + e + "  f = " + f);
        f = (e--) * 2;//e = 31  f = 64
        System.out.println("4-->e = " + e + "  f = " + f);
        f = (--e) * 2;// e = 30  f = 60
        System.out.println("5-->e = " + e + "  f = " + f);


    }
}
