package com.test.aspectj.expression;

import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description 食品工厂
 */
@Component
public class FoodFactory implements Factory {
    /**
     * 制作产品
     */
    @Override
    public void make() {
        System.out.println("生产食品");
    }
}
