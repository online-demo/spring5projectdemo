package com.test.prototype;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 原型模式测试
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        Computer asus = ComputerPrototype.getComputer("ASUS");
        asus.make();
        Computer lenovo = ComputerPrototype.getComputer("Lenovo");
        lenovo.make();
        Computer macBook = ComputerPrototype.getComputer("MacBook");
        macBook.make();
    }
}
