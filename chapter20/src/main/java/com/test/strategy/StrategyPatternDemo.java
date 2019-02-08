package com.test.strategy;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 策略模式测试类
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println("10 + 20 = " + context.execute(10, 20));
        context = new Context(new Subtraction());
        System.out.println("10 - 20 = " + context.execute(10, 20));
        context = new Context(new Multiplication());
        System.out.println("10 * 20 = " + context.execute(10, 20));
    }
}
