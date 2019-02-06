package com.test.criteria;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description:
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
}
