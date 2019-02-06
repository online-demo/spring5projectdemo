package com.test.bridge;

import com.test.common.Computer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description:
 */
public class ComputerBridge extends Bridge {

    public ComputerBridge(Computer computer) {
        super(computer);
    }

    @Override
    public void makeComputer() {
        computer.make();
    }
}
