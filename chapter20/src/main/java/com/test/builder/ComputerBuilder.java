package com.test.builder;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 电脑建造者
 */
public class ComputerBuilder {

    /**
     * 创建廉价电脑
     */
    public Computer buildCheap() {
        Computer computer = new Computer();
        computer.addItem(new AMD());
        computer.addItem(new PHILIPS());
        return computer;
    }

    /**
     * 创建高价电脑
     */
    public Computer buildExpensive() {
        Computer computer = new Computer();
        computer.addItem(new Intel());
        computer.addItem(new DELL());
        return computer;
    }
}
