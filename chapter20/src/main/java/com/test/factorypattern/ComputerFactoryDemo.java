package com.test.factorypattern;

import com.test.common.Computer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description: 测试类
 */
public class ComputerFactoryDemo {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        //创建ASUS
        Computer asus = computerFactory.createComputer("ASUS");
        asus.make();
        //创建Lenovo
        Computer lenovo = computerFactory.createComputer("Lenovo");
        lenovo.make();
        //创建MacBook
        Computer macBook = computerFactory.createComputer("MacBook");
        macBook.make();
    }
}
