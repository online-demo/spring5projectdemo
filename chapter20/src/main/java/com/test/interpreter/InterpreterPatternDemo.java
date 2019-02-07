package com.test.interpreter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 解释器模式测试类
 */
public class InterpreterPatternDemo {
    public static void main(String[] args) {
        NumericalExpression expression1
                = new NumericalExpression(10, 8);
        NumericalExpression expression2
                = new NumericalExpression(10, 20);
        AndExpression andExpression
                = new AndExpression(expression1, expression2);
        OrExpression orExpression
                = new OrExpression(expression1, expression2);
        System.out.println("10 > 8 && 10 > 20 ? " + andExpression.interpret());
        System.out.println("10 > 8 || 10 > 20 ? " + orExpression.interpret());
    }
}
