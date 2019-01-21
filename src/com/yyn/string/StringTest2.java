package com.yyn.string;

/**
 * Created By Administrator
 * Date: 2018/12/11
 * Time: 21:23
 */
public class StringTest2 {
    public static void main(String str[]) {
/*
        1	char charAt(int index)
        返回指定索引处的 char 值。
       2 int compareTo(String anotherString)
        按字典顺序比较两个字符串。
        3	int compareToIgnoreCase(String str)
        按字典顺序比较两个字符串，不考虑大小写。
        5	String concat(String str)
        将指定字符串连接到此字符串的结尾。
        9	boolean endsWith(String suffix)
        测试此字符串是否以指定的后缀结束。
        10	boolean equals(Object anObject)
        将此字符串与指定的对象比较。
        11	boolean equalsIgnoreCase(String anotherString)
        将此 String 与另一个 String 比较，不考虑大小写。
        17	int indexOf(int ch, int fromIndex)
        返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
        18	int indexOf(String str)
        返回指定子字符串在此字符串中第一次出现处的索引。
        19	int indexOf(String str, int fromIndex)
        返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
        23	int lastIndexOf(String str)
        返回指定子字符串在此字符串中最右边出现处的索引。
        24	int lastIndexOf(String str, int fromIndex)
        返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。
        25	int length()
        返回此字符串的长度。
        29	String replace(char oldChar, char newChar)
        返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
        30	String replaceAll(String regex, String replacement
        使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
        32	String[] split(String regex)
        根据给定正则表达式的匹配拆分此字符串。
        34	boolean startsWith(String prefix)
        测试此字符串是否以指定的前缀开始。
        35	boolean startsWith(String prefix, int toffset)
        测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
        37	String substring(int beginIndex)
        返回一个新的字符串，它是此字符串的一个子字符串。
        38	String substring(int beginIndex, int endIndex)
        返回一个新字符串，它是此字符串的一个子字符串。
        39	char[] toCharArray()
        将此字符串转换为一个新的字符数组。
        40	String toLowerCase()
        使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
        43	String toUpperCase()
        使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
        45	String trim()
        返回字符串的副本，忽略前导空白和尾部空白*/


        String a = "yangYAna";
        String b = "yangyana";
//        1	char charAt(int index)
//        返回指定索引处的 char 值。
        System.out.println("a.charAt(4)=  " + a.charAt(4));
//        2 int compareTo(String anotherString)
//        按字典顺序比较两个字符串。
        System.out.println("a.compareTo(b)=  " + a.compareTo(b));

//        3	int compareToIgnoreCase(String str)
//        按字典顺序比较两个字符串，不考虑大小写。
        System.out.println("a.compareToIgnoreCase(b)=  " + a.compareToIgnoreCase(b));

//        5	String concat(String str)
//        将指定字符串连接到此字符串的结尾。
        System.out.println("a.concat(b)=  " + a.concat(b));

//        9	boolean endsWith(String suffix)
//        测试此字符串是否以指定的后缀结束。
        System.out.println("a.endsWith(b)=  " + a.endsWith(b));

        System.out.println("a.endsWith(\"na\")=  " + a.endsWith("na"));

//     10	boolean equals(Object anObject)
//     将此字符串与指定的对象比较。
        System.out.println("a.equals(b)=  " + a.equals(b));

//     11	boolean equalsIgnoreCase(String anotherString)
//     将此 String 与另一个 String 比较，不考虑大小写。
        System.out.println("a.equalsIgnoreCase(b)=  " + a.equalsIgnoreCase(b));

     /*a.charAt(4)=  Y
     a.compareTo(b)=  -32
     a.compareToIgnoreCase(b)=  0
     a.concat(b)=  yangYAnayangyana
     a.endsWith(b)=  false
     a.endsWith("na")=  true
     a.equals(b)=  false
     a.equalsIgnoreCase(b)=  true*/


//     18	int indexOf(String str)
//     返回指定子字符串在此字符串中第一次出现处的索引。  索引即下标
        System.out.println("a.indexOf(b)=  " + a.indexOf(b));
        System.out.println("a.indexOf(\"n\")=  " + a.indexOf("n"));
//     19	int indexOf(String str, int fromIndex)
//     返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
        System.out.println("a.indexOf(\"n\",1)=  " + a.indexOf("n", 1));//"yangYAna"
        System.out.println("a.indexOf(\"n\",4)=  " + a.indexOf("n", 4));//"yangYAna"
//     a.indexOf(b)=  -1
//     a.indexOf("n")=  2
//     a.indexOf("n",1)=  2
//     a.indexOf("n",4)=  6

        a = "杨雅娜雅娜";

//        23	int lastIndexOf(String str)
//        返回指定子字符串在此字符串中最右边出现处的索引。
        System.out.println(a.lastIndexOf("雅"));//  3
        System.out.println(a.lastIndexOf("雅1"));//   -1

//        24	int lastIndexOf(String str, int fromIndex)
//        返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。

        System.out.println(a.lastIndexOf("雅", 6));//  3
        System.out.println(a.lastIndexOf("雅", 4));//  3
        System.out.println(a.lastIndexOf("雅", 3));//  3
        System.out.println(a.lastIndexOf("雅", 2));//  1

//        25	int length()
//        返回此字符串的长度。
        System.out.println(a.length());//  5

//        29	String replace(char oldChar, char newChar)
//        返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
        System.out.println(a.replace("雅", "小花"));//  杨小花娜小花娜

//        30	String replaceAll(String regex, String replacement
//        使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
        System.out.println(a.replaceAll("雅", "小花"));//  杨小花娜小花娜


//        32	String[] split(String regex)
//        根据给定正则表达式的匹配拆分此字符串。
        String[] arr = a.split("雅");
        for (String aaa : arr) {
            System.out.println(aaa);
//         杨
//         娜
//         娜

        }

        arr = a.split("雅1");
        for (String aaa : arr) {
            System.out.println("---->"+aaa);//---->杨雅娜雅娜
        }

//        34	boolean startsWith(String prefix)
//        测试此字符串是否以指定的前缀开始。
        System.out.println(a.startsWith("雅"));//  false


//        35	boolean startsWith(String prefix, int toffset)
//        测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
        System.out.println(a.startsWith("雅",2));// false

//        37	String substring(int beginIndex)   裁剪
//        返回一个新的字符串，它是此字符串的一个子字符串。
        System.out.println(a.substring(2));// 娜雅娜

//        38	String substring(int beginIndex, int endIndex)
////        返回一个新字符串，它是此字符串的一个子字符串。
        System.out.println(a.substring(2,5));//  娜雅娜   裁剪下标2,3,4位置
        System.out.println(a.substring(2,4));//  娜雅


//        39	char[] toCharArray()
//        将此字符串转换为一个新的字符数组。
        char[] charArr = a.toCharArray();// {'杨','雅','娜','雅','娜'}
        System.out.println(charArr.length);//  5

//        40	String toLowerCase()
//        使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
        a=" ABCdef " ;
        System.out.println(a.toLowerCase());//  abcdef


//        43	String toUpperCase()
//        使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
        System.out.println(a.toUpperCase());//  ABCDEF

//        45	String trim()
//        返回字符串的副本，忽略前导空白和尾部空白*/
        System.out.println(a.length());//  8
        System.out.println(a.trim().length());//  6






    }
}
