package com.test.flyweight;

/**
 * @Author: zhouguaya
 * @Date: 2019/02/05
 * @Description: 电脑制造类
 */
public class ComputerProducer implements Computer {

    private String brand;

    public ComputerProducer(String brand) {
        this.brand = brand;
    }

    /**
     * 制造电脑
     */
    @Override
    public void make() {
        System.out.println("produce a " + brand + " Computer");
    }
}
