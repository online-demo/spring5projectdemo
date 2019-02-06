package com.test.builder;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 显示器
 */
public abstract class Screen implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
