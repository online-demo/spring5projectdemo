package com.test.jdk8.lambda;

/**
 * @Author zhouguanya
 * @Date 2018/10/12
 * @Description
 */
public class Person {
    /**
     * 姓名
     */
    public String name;
    /**
     * 年龄
     */
    public int age;

    /**
     * 构造器
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.age;
    }
}
