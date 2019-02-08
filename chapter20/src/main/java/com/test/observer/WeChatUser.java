package com.test.observer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 微信用户
 */
public class WeChatUser implements Observer {
    private String name;
    private String message;
    public WeChatUser(String name) {
        this.name = name;
    }
    @Override
    public void listen(String message) {
        this.message = message;
        System.out.printf("%s收到微信公众号的消息：%s%n", name, this.message);
    }
}
