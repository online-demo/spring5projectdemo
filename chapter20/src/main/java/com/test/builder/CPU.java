package com.test.builder;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: CPU
 */
public abstract class CPU implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
