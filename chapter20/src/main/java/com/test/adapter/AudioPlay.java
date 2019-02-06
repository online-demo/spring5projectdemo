package com.test.adapter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 音频播放器
 */
public class AudioPlay implements Player {
    PlayAdapter playAdapter;

    @Override
    public void play(String type) {
        if ("MP3".equals(type)) {
            System.out.println("播放MP3格式的文件");
        } else if ("MP4".equals(type) || "RMVB".equals(type)) {
            playAdapter = new PlayAdapter(type);
            playAdapter.play(type);
        }
    }
}
