package com.yyn.character;

/**
 * Created By Administrator
 * Date: 2018/12/10
 * Time: 21:21
 */
public class CharacterTest2 {
    public static void main(String[] str) {

//        'a','1','A' // 全都是字符，长度为1
//        'ASD' // 不是字符！！！！ 长度 > 1 的全都不是字符！！！

       /* isLetter()  是否是一个字母
        2	isDigit() 是否是一个数字字符
        3	isWhitespace() 是否一个空格
        4	isUpperCase() 是否是大写字母
        5	isLowerCase() 是否是小写字母
        6	toUpperCase() 指定字母的大写形式
        7	toLowerCase()  指定字母的小写形式
        8	toString() 返回字符的字符串形式，字符串的长度仅为1*/
        char a = 'a';
        char b = '1';
        char c = 'C';

        System.out.println("Character.isLetter(a) = "
                + Character.isLetter(a) + "   Character.isLetter(b) =  "
                + Character.isLetter(b));
//        Character.isLetter(a) = true   Character.isLetter(b) =  false
        System.out.println("Character.isDigit(a) = "
                + Character.isDigit(a) + "   Character.isDigit(b) =  "
                + Character.isDigit(b));
//        Character.isDigit(a) = false   Character.isDigit(b) =  true

        System.out.println("Character.isWhitespace(a) = "
                + Character.isWhitespace(a) + "   Character.isWhitespace(b) =  "
                + Character.isWhitespace(b));
//        Character.isWhitespace(a) = false   Character.isWhitespace(b) =  false

        System.out.println("Character.isUpperCase(a) = "
                + Character.isUpperCase(a) + "   Character.isUpperCase(b) =  "
                + Character.isUpperCase(b) + Character.isUpperCase(c));
//        Character.isUpperCase(a) = false   Character.isUpperCase(b) =  false   Character.isUpperCase(c) = true

        System.out.println("Character.isLowerCase(a) = "
                + Character.isLowerCase(a) + "   Character.isLowerCase(b) =  "
                + Character.isLowerCase(b));
//        Character.isLowerCase(a) = true   Character.isLowerCase(b) =  false

//        6	toUpperCase() 指定字母的大写形式
//        7	toLowerCase()  指定字母的小写形式
//        8	toString() 返回字符的字符串形式，字符串的长度仅为1

        System.out.println("Character.toUpperCase(a) = "
                + Character.toUpperCase(a) + "   Character.toUpperCase(b) =  "
                + Character.toUpperCase(b) + "   Character.toUpperCase(c) =  "
                + Character.toUpperCase(c));
//        Character.toUpperCase(a) = A   Character.toUpperCase(b) =  1   Character.toUpperCase(c) =  C

        System.out.println("Character.toLowerCase(a) = "
                + Character.toLowerCase(a) + "   Character.toLowerCase(b) =  "
                + Character.toLowerCase(b) + "   Character.toLowerCase(c) =  "
                + Character.toLowerCase(c));
//        Character.toLowerCase(a) = a   Character.toLowerCase(b) =  1   Character.toLowerCase(c) =  c
        System.out.println("c = " + c);// c = C
        c = Character.toLowerCase(c);
        System.out.println("c = " + c);// c = c

        System.out.println("Character.toString(a) = "
                + Character.toString(a) + "   Character.toString(b) =  "
                + Character.toString(b) + "   Character.toString(c) =  "
                + Character.toString(c));
//        Character.toString(a) = a   Character.toString(b) =  1   Character.toString(c) =  C
        System.out.println("Character.toString('a').equals(\"a\") = "
                + Character.toString('a').equals("a"));
//        Character.toString('a').equals("a") = true


    }
}

//        Character.isLetter(a) = true   Character.isLetter(b) =  false
//        Character.isDigit(a) = false   Character.isDigit(b) =  true
//        Character.isWhitespace(a) = false   Character.isWhitespace(b) =  false
//        Character.isUpperCase(a) = false   Character.isUpperCase(b) =  false
//        Character.isLowerCase(a) = true   Character.isLowerCase(b) =  false
//        Character.toUpperCase(a) = A   Character.toUpperCase(b) =  1   Character.toUpperCase(c) =  C
//        Character.toLowerCase(a) = a   Character.toLowerCase(b) =  1   Character.toLowerCase(c) =  c
//        Character.toString(a) = a   Character.toString(b) =  1   Character.toString(c) =  C