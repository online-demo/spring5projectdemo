package com.test.decorator;

import com.test.common.Computer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 红色电脑装饰器
 */
public class RedComputerDecorator extends ComputerDecorator {
    public RedComputerDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public void make() {
        super.make();
        paintColor();
    }

    private void paintColor() {
        System.out.println("给电脑涂上红色");
    }
}
