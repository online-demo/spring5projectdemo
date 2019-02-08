package com.test.mediator;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 用户
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        BBS.showMessage(this,message);
    }
}
