package com.test.strategy;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 加法
 */
public class Addition implements Strategy {

    @Override
    public int execute(int num1, int num2) {
        return num1 + num2;
    }
}
