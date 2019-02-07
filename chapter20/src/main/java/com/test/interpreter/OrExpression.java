package com.test.interpreter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 或表达式解释器
 */
public class OrExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret() {
        return expression1.interpret() || expression2.interpret();
    }
}
