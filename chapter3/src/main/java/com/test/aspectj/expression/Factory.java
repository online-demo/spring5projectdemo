package com.test.aspectj.expression;

/**
 * @Author zhouguanya
 * @Date 2018/9/100
 * @Description 工厂接口
 */
public interface Factory {
    /**
     * 制作产品
     */
    void make();

    /**
     * 运输
     */
    void delivery(String address);
}
