package com.yyn.string;

/**
 * Created By Administrator
 * Date: 2018/12/10
 * Time: 22:32
 */
public class StringTest {
    public static void main(String str[]) {

        String a =new String();
        System.out.println("a=new String()=" + a);
        a = new String("asdfg");
        System.out.println("a=new String(\"asdfg\")=" + a);
        char[] arry = {'1', '2', '3', '4'};
        a = new String(arry);
        System.out.println("a=new String(arry)=" + a);
        a = new String(arry, 1, 2);//数组,下标,计算的量
        System.out.println("a=new String(arry,1,2)=" + a);
//        a=new String()=
//        a=new String("asdfg")=asdfg
//        a=new String(arry)=1234
//        a=new String(arry)=23

//        字符串长度
        String a1="小眼镜";
        System.out.println("a1.length()=  "+a1.length());//a1.length()=  3

        //连接字符串
        String z="小狗";
        String x="是小花";
        System.out.println("z.concat(x)=  "+z.concat(x));
        System.out.println(z+"-->" +  x);
        System.out.println("z+x=  "+z+x);
//        z.concat(x)=  小狗是小花
//        小狗-->是小花
//        z+x=  小狗是小花

        //格式化字符串
        String c="%s喜欢雅娜";
        System.out.println(String.format(c, "小花","777"));
        c="%2$s喜欢雅娜de%1$s";
        System.out.println(String.format(c, "小花","一辈子"));
        c="%s喜欢雅娜%d年";
        System.out.println(String.format(c, "小花",10000));
        c="%d喜欢雅娜%s年";
        System.out.println(String.format(c, "小花2",10000));

//        小花喜欢雅娜
//        一辈子喜欢雅娜de小花
//        小花喜欢雅娜10000年


    }
}
