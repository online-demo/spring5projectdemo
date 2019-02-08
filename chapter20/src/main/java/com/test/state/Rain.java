package com.test.state;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 下雨
 */
public class Rain implements State {
    @Override
    public String getState() {
        return "今天的天气：下雨";
    }
}
