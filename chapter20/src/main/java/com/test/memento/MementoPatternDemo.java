package com.test.memento;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 备忘录模式测试类
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Original original = new Original();
        StateKeeper keeper = new StateKeeper();
        original.setState("State 1");
        keeper.addState(original.saveMementoState());
        //状态变更
        original.setState("State 2");
        keeper.addState(original.saveMementoState());
        //状态变更
        original.setState("State 3");
        System.out.println("Current State is :" + original.getState());
        //第1次保存的状态
        original.getMementoState(keeper.get(0));
        System.out.println("Initial State: " + original.getState());
        //第2次保存的状态
        original.getMementoState(keeper.get(1));
        System.out.println("Second State: " + original.getState());
    }
}
