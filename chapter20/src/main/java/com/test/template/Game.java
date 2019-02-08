package com.test.template;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 游戏类
 */
public abstract class Game {
    abstract void init();
    abstract void start();
    abstract void pause();
    abstract void end();

    void play() {
        init();
        start();
        pause();
        end();
    }
}
