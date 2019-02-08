package com.test.strategy;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 减法
 */
public class Subtraction implements Strategy {
    @Override
    public int execute(int num1, int num2) {
        return num1 - num2;
    }
}
