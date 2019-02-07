package com.test.flyweight;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 享原模式测试类
 */
public class FlyweightPatternDemo {
    static String brands[] = { "ASUA", "Lenovo", "MacBook"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Computer computer = ComputerFactory.getComputer(getRandomBrand());
            computer.make();
        }
    }

    private static String getRandomBrand() {
        return brands[(int)(Math.random() * brands.length)];
    }
}
