package com.test.observer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 观察者模式测试类
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeChatPulic weChatPulic = new WeChatPulic();
        WeChatUser weChatUser1 = new WeChatUser("Jack");
        WeChatUser weChatUser2 = new WeChatUser("Tom");
        WeChatUser weChatUser3 = new WeChatUser("John");
        weChatPulic.addObserver(weChatUser1);
        weChatPulic.addObserver(weChatUser2);
        weChatPulic.addObserver(weChatUser3);
        weChatPulic.setMessage("Hello World");
    }
}
