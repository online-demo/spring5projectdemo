package com.test.builder;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description:
 */
public class Intel extends CPU {
    @Override
    public String name() {
        return "Intel处理器";
    }

    @Override
    public int price() {
        return 3000;
    }
}
