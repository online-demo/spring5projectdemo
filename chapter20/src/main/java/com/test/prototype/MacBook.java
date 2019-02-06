package com.test.prototype;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description: MacBook
 */
public class MacBook extends Computer {
    /**
     * 制造MacBook电脑
     */
    @Override
    public void make() {
        System.out.println("produce a MacBook Computer");
    }
}
