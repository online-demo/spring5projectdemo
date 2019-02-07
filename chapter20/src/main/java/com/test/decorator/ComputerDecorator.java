package com.test.decorator;

import com.test.common.Computer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description:
 */
public abstract class ComputerDecorator implements Computer {
    Computer computer;
    public ComputerDecorator (Computer computer) {
        this.computer = computer;
    }

    public void make() {
        computer.make();
    }
}
