package com.test.state;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 状态模式测试类
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.setState(new Rain());
        System.out.println(weather.getWeather());
        weather.setState(new Sunshine());
        System.out.println(weather.getWeather());
    }
}
