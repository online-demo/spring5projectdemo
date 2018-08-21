package com.test.jdkdynamicproxy;

/**
 * @Author zhouguanya
 * @Date 2018/8/20
 * @Description 测试
 */
public class JDKDynamicProxyDemo {
    public static void main(String[] args) {
        //被代理对象
        Dog dog = new Dog();
        //动态代理类对象
        AnimalInvocationHandler animalInvocationHandler = new AnimalInvocationHandler();
        //代理对象
        Animal proxy = (Animal) animalInvocationHandler.bind(dog);
        proxy.eat();
    }
}
