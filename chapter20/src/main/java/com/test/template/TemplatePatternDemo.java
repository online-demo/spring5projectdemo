package com.test.template;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 模板模式测试类
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game tetris = new Tetris();
        tetris.play();
        System.out.println("-----------分割线-----------");
        Game superMarie = new SuperMarie();
        superMarie.play();
    }
}
