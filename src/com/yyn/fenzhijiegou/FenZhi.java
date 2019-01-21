package com.yyn.fenzhijiegou;

/**
 * Created By Administrator
 * Date: 2018/12/5
 * Time: 21:28
 */
public class FenZhi {
    public static void main(String[] str) {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                System.out.println("小花喜欢小花媳妇-->"+i);
            } else {
                System.out.println("小花是小狗-->"+i);
            }
        }
        System.out.println("---------------------2");
        for (int i = 0; i < 10; i++) {
            if(i==2){
                System.out.println("小花---》"+i);
            }else if(i==4){
                System.out.println("喜欢---》"+i);
            }else if(i==6){
                System.out.println("小花媳妇---》"+i);
            }else{
                System.out.println("小花喜欢小花媳妇---》"+i);
            }

        }

        System.out.println("---------------------3");
        for (int i = 0; i < 10; i++) {
            if(i<5){
                if(i%2==0){
                    System.out.println("i%2==0---->"+i);
                }
            }

            if(i<5 && i%2==0){
                System.out.println("i<5 && i%2==0 ---->"+i);

            }

        }

        System.out.println("---------------------4  switch");
        for (int i = 0; i < 10; i++) {
//            if(i==2){
//                System.out.println("小花---》"+i);
//            }else if(i==4){
//                System.out.println("喜欢---》"+i);
//            }else if(i==6){
//                System.out.println("小花媳妇---》"+i);
//            }else{
//                System.out.println("小花喜欢小花媳妇---》"+i);
//            }
            switch (i) {
                case 2:
                    System.out.println("小花---switch》" + i);

                    break;
                case 4:
                    System.out.println("喜欢---switch》" + i);
//                    喜欢---switch》4
//                    小花媳妇---switch》4
//                    break;
                case 6:
                    System.out.println("小花媳妇---switch》" + i);

                    break;
                default:
                    System.out.println("小花喜欢小花媳妇---switch》" + i);

                    break;
            }

        }

    }
}
