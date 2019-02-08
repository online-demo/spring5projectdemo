package com.test.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 微信公众号
 */
public class WeChatPulic {
    //观察者列表
    private List<Observer> observerList;

    private String message;

    public WeChatPulic() {
        observerList = new ArrayList<>();
    }
    // 状态变更通知观察者
    public void setMessage(String message) {
        this.message = message;
        System.out.println("微信公众号更新消息：" + message);
        notifyObserverList();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void notifyObserverList() {
        for (Observer observer : observerList) {
            observer.listen(message);
        }
    }
}
