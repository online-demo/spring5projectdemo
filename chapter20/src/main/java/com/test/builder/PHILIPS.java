package com.test.builder;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description:
 */
public class PHILIPS extends Screen {
    @Override
    public String name() {
        return "PHILIPS显示器";
    }

    @Override
    public int price() {
        return 1000;
    }
}
