package com.test.adapter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 适配器模式测试类
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlay audioPlay = new AudioPlay();
        audioPlay.play("MP3");
        audioPlay.play("MP4");
        audioPlay.play("RMVB");
    }
}
