package com.test.adapter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 播放器适配器
 */
public class PlayAdapter implements Player {
    private AdvancedPlayer advancedPlayer;

    public PlayAdapter (String type) {
        if ("MP4".equals(type)) {
            advancedPlayer = new Mp4Play();
        } else if ("RMVB".equals(type)) {
            advancedPlayer = new RmvbPlay();
        }
    }

    @Override
    public void play(String type) {
        if ("MP4".equals(type)) {
            advancedPlayer.playMp4();
        } else if ("RMVB".equals(type)) {
            advancedPlayer.playRMVB();
        }
    }
}
