package com.test.aspectj.expression;

import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description 手机工厂
 */
@Component
public class PhoneFactory implements Factory {
    /**
     * 制作产品
     */
    @Override
    @Log
    public void make() {
        System.out.println("生产手机");
    }
}
