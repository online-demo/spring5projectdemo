package com.test.decorator;

import com.test.common.Computer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 白色电脑装饰器
 */
public class WhiteComputerDecorator extends ComputerDecorator {
    public WhiteComputerDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public void make() {
        super.make();
        paintColor();
    }

    private void paintColor() {
        System.out.println("给电脑涂上白色");
    }
}
