package com.test.singleton;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description: 单例
 */
public class SingletonObject {
    //创建 SingletonObject 的一个对象
    private static SingletonObject instance = new SingletonObject();
    //让构造函数为 private，这样该类就不会被实例化
    private SingletonObject(){

    }
    //获取唯一可用的对象
    public static SingletonObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
