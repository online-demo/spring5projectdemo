package com.test.common;

/**
 * @Author: zhouguaya
 * @Date: 2019/02/05
 * @Description: ASUS类
 */
public class ASUS implements Computer {
    /**
     * 制造ASUS电脑
     */
    @Override
    public void make() {
        System.out.println("produce a ASUS Computer");
    }
}
