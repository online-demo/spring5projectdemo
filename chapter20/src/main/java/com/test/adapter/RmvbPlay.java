package com.test.adapter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: RMVB格式播放器
 */
public class RmvbPlay implements AdvancedPlayer {
    /**
     * 播放MP4
     */
    @Override
    public void playMp4() {

    }

    /**
     * 播放RMVB
     */
    @Override
    public void playRMVB() {
        System.out.println("播放RMVB格式的文件");
    }
}
