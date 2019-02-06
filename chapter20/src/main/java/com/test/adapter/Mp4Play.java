package com.test.adapter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: MP4格式播放器
 */
public class Mp4Play implements AdvancedPlayer {
    /**
     * 播放MP4
     */
    @Override
    public void playMp4() {
        System.out.println("播放MP4格式的文件");
    }

    /**
     * 播放RMVB
     */
    @Override
    public void playRMVB() {

    }
}
