package com.test.strategy;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description:
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return strategy.execute(num1, num2);
    }
}
