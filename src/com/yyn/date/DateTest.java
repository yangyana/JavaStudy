package com.yyn.date;

import com.yyn.AA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created By Administrator
 * Date: 2019/1/7
 * Time: 20:50
 */
public class DateTest {
    public static void main(String[] str) {
        Date a = new Date();
        Date b = new Date(System.currentTimeMillis() - 1000 * 60 * 60);

//        10.	String toString( )
//        转换Date对象为String表示形式，并返回该字符串。
        System.out.println("a = " + a.toString());//a = Mon Jan 07 22:06:37 CST 2019
        System.out.println("b = " + b.toString());//b = Mon Jan 07 21:06:37 CST 2019

//        1	boolean after(Date date)//两个date对象相比较
//        若当调用此方法的Date对象在指定日期之后返回true,否则返回false。
        System.out.println("a.after(b) = " + a.after(b));//a.after(b) = true


//        2	boolean before(Date date)
//        若当调用此方法的Date对象在指定日期之前返回true,否则返回false。
        System.out.println(" a.before(b)  = " + a.before(b));// a.before(b)  = false

//        3	Object clone( )
//        返回此对象的副本。
        Date c = (Date) b.clone();//强转成 Date类型
        System.out.println(" c  = " + c.toString());


//        4	int compareTo(Date date)
//        比较当调用此方法的Date对象和指定日期。两者相等时候返回0。调用对象在指定日期之前则返回负数。调用对象在指定日期之后则返回正数。
        System.out.println(" a.compareTo(b)  = " + a.compareTo(b));//a.compareTo(b)  = 1
        System.out.println(" b.compareTo(c)  = " + b.compareTo(c));//  b.compareTo(c) = 0


//        6	boolean equals(Object date)
//        当调用此方法的Date对象和指定日期相等时候返回true,否则返回false。
        System.out.println(" a.equals(c)  = " + a.equals(c));// a.equals(c)  = false


//        7	long getTime( )//返回date对象的毫秒数
//        返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        System.out.println(" a.getTime()  = " + a.getTime());// a.getTime()  = 1546869599912

//        8	int hashCode( )
//        返回此对象的哈希码值。
        System.out.println(" a.hashCode()  = " + a.hashCode());// a.hashCode()  = 681538344
        System.out.println(" b.hashCode()  = " + b.hashCode());// b.hashCode()  = 677937832
        System.out.println(" c.hashCode()  = " + c.hashCode());//c.hashCode()  = 677937832


//        9	void setTime(long time)/重新设置毫秒数
//        用自1970年1月1日00:00:00 GMT以后time毫秒数设置时间和日期。
        b.setTime(System.currentTimeMillis());
        System.out.println(b.toString());//Mon Jan 07 22:06:37 CST 2019


//        使用SimpleDateFormat格式化日期

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//       yyyy/MM/dd    ->  2019/01/08
//        yyyy年MM月dd日    ->  2019年01月08日
        System.out.println("Current Date: " + simpleDateFormat.format(new Date()));

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//       yyyy-MM-dd hh:mm:ss    ->  2019-01-08 09:59:45
//        yyyy-MM-dd HH:mm:ss    ->  2019-01-08 22:00:39
        System.out.println("Current Date2: " + simpleDateFormat.format(new Date()));


        simpleDateFormat = new SimpleDateFormat("HH:mm");
//       HH:mm   ->  22:01
        System.out.println("Current Date3: " + simpleDateFormat.format(new Date()));

        long time = System.currentTimeMillis() - 1000 * 1000 * 1000;
        simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        System.out.println("--> " + simpleDateFormat.format(new Date(time)));

        time = 1546956962443L;
//        simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        System.out.println("--2 > " + simpleDateFormat.format(new Date(time)));

        String timeStr = "2017年06月28日 20:10";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        try {
            Date aa = sf.parse(timeStr);
            System.out.println(aa.getTime());// 1498651800000
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("捕捉到异常了");

        }

    }
}
