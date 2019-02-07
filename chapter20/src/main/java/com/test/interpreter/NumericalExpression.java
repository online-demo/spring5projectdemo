package com.test.interpreter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description:
 */
public class NumericalExpression implements Expression {
    private int value1;
    private int value2;

    public NumericalExpression(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public boolean interpret() {
        return (value1 - value2) > 0;
    }
}
