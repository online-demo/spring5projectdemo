package com.test.template;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 超级玛丽
 */
public class SuperMarie extends Game {
    @Override
    void init() {
        System.out.println("Init SuperMarie Game");
    }

    @Override
    void start() {
        System.out.println("Start SuperMarie Game");
    }

    @Override
    void pause() {
        System.out.println("Pause SuperMarie Game");
    }

    @Override
    void end() {
        System.out.println("End SuperMarie Game");
    }
}
