package com.test.jdk8.defaultmethod;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/23
 * @Description:
 */
public interface Whistle {
    /**
     * 默认方法
     */
    default void print() {
        System.out.println("我要鸣笛");
    }

    /**
     * 静态方法
     */
    static void horn(){
        System.out.println("按喇叭~");
    }
}
