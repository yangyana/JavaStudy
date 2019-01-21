package com.yyn.xiushifu;

import com.yyn.demo.JiBenShuJuLeiXing2;

/**
 * Created By Administrator
 * Date: 2018/11/25
 * Time: 13:54
 */
public class XiuShiFu {
    private static int abc = 100;
    protected static int abc1 = 101;
    public static int abc2 = 102;

    private int xiaoHua() {
        return 0;
    }

    protected static long xiaoHua2() {
        return 1;
    }

    public static short xiaoHua3() {
        return 2;
    }
    public static short xiaoHua3(short a) {
        return (short)(a+2);
    }
}
