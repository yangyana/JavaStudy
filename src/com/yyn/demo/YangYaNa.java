package com.yyn.demo;

/**
 * Created By Administrator
 * Date: 2018/11/10
 * Time: 20:45
 */
public class YangYaNa {
    public String value ;
    public static String value2 ;
    public static void main(String []args){
        System.out.println("小花好可爱");
        System.out.println();

        System.out.println("雅娜好可爱");
        System.out.println(yang());
        System.out.println(yang2("xiaohua2"));
        System.out.println(yang3("xiaohua2"));
        System.out.println(yang3(10));
        System.out.println(yang5(10));
        System.out.println(yang5(11)+yang5(11));

    }

    protected static String yang(){
        return "xiaohua";
    }
    public static String yang2(String xiaokeai){
        return xiaokeai;

    }
    public static String yang3(String xiaokeai){
        return xiaokeai+xiaokeai;
    }
    public static String yang3(int xiaokeai){
        String str="YaNa ->"+xiaokeai;
        return str;
//        return string.valueOf(xiaokeai) ;
    }

    public  String yang33(int xiaokeai){
        value ="YaNa ->"+xiaokeai;
        return value;
//        return string.valueOf(xiaokeai) ;

    }
    public static int yang5(int xiaokeai){
        value2 ="";
        return xiaokeai ;
    }
}
