package com.test.jdkdynamicproxy;

/**
 * @Author zhouguanya
 * @Date 2018/8/20
 * @Description 接口实现类
 */
public class Dog implements Animal {
    /**
     * 接口方法
     */
    @Override
    public void eat() {
        System.out.println("Dog需要吃骨头");
    }
}
