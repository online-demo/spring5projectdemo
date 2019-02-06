package com.test.builder;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 建造者模式测试
 */
public class BuilderPattenDemo {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Computer cheapComputer = computerBuilder.buildCheap();
        cheapComputer.showItems();
        ComputerBuilder expensiveBuilder = new ComputerBuilder();
        Computer expensiveComputer = expensiveBuilder.buildExpensive();
        expensiveComputer.showItems();
    }
}
