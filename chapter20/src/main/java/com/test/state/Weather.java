package com.test.state;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 天气类
 */
public class Weather {
    private State state;

    public void setState(State state) {
        this.state = state;
    }
    public String getWeather() {
        return state.getState();
    }
}
