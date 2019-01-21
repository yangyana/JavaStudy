package com.yyn.stringbuffer;

/**
 * Created By Administrator
 * Date: 2018/12/19
 * Time: 22:16
 */
public class StringBufferTest {
    public static void main(String[] str) {
        StringBuffer stringBuffer = new StringBuffer("ABC");
        System.out.println(stringBuffer);//  ABC

//        public StringBuffer append(String s)
//        将指定的字符串追加到此字符序列。
        System.out.println(stringBuffer.append("DEF"));//  ABCDEF


//        2	public StringBuffer reverse()
//        将此字符序列用其反转形式取代。
        System.out.println(stringBuffer.reverse());// FEDCBA

//        3	public delete(int start, int end)
//        移除此序列的子字符串中的字符。
        System.out.println(stringBuffer.delete(2, 4));// FEBA  包含2不包含4

//        4	public insert(int offset, int i)
//        将 int 参数的字符串表示形式插入此序列中。
        System.out.println(stringBuffer.insert(2, 100000));// FE100000BA  把100000插入到2的位置

//        5	replace(int start, int end, String str)
//        使用给定 String 中的字符替换此序列的子字符串中的字符。
        System.out.println(stringBuffer.replace(1, 2, "杨雅娜"));// F杨雅娜100000BA
        System.out.println(stringBuffer.replace(1,4, "小狗喜欢杨雅娜"));// F小狗喜欢杨雅娜100000BA
        System.out.println("stringBuffer = "+stringBuffer);// stringBuffer = F小狗喜欢杨雅娜100000BA



        StringBuilder stringBuilder=new StringBuilder("yangyana");
        System.out.println(stringBuilder.toString());//  yangyana
    }
}
