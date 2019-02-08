package com.test.state;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 晴天
 */
public class Sunshine implements State {
    @Override
    public String getState() {
        return "今天的天气：晴天";
    }
}
