package com.test.aspectj.advicetype;

import org.springframework.stereotype.Component;

/**
 * @Author: zhouguanya
 * @Date: 2018/9/1
 * @Description: 一个Spring Bean
 */
@Component
public class Person {

    /**
     * 说话的方法
     */
    public void say() {
        System.out.println("Hello Spring50");
    }
}
