package com.test.builder;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description:
 */
public class AMD extends CPU {
    @Override
    public String name() {
        return "AMD处理器";
    }

    @Override
    public int price() {
        return 2000;
    }
}
