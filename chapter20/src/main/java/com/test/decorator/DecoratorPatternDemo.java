package com.test.decorator;

import com.test.common.ASUS;
import com.test.common.Computer;
import com.test.common.Lenovo;
import com.test.common.MacBook;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 装饰器模式测试类
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Computer whiteComputer = new WhiteComputerDecorator(new ASUS());
        whiteComputer.make();
        Computer goldenComputer = new GoldenComputerDecorator(new Lenovo());
        goldenComputer.make();
        Computer redComputer = new RedComputerDecorator(new MacBook());
        redComputer.make();
    }
}
