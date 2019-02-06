package com.test.bridge;

import com.test.common.Computer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 桥接
 */
public abstract class Bridge {
    protected Computer computer;
    public Bridge(Computer computer) {
        this.computer = computer;
    }

    public abstract void makeComputer();
}
