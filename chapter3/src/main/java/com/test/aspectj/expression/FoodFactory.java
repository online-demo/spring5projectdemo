package com.test.aspectj.expression;

import com.test.aspectj.expression.args.FreshFoodFactory;
import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description 食品工厂
 */
@Component
public class FoodFactory implements Factory {
    /**
     * 制作产品的方法
     */
    @Override
    public void make() {
        System.out.println("生产食品");
    }

    /**
     * 运输
     *
     * @param address
     */
    @Override
    public void delivery(String address) {
        System.out.println("销售食品至" + address);
    }

    /**
     * 测试@args注解
     */
    public void testArgsAnnotation(FreshFoodFactory freshFoodFactory) {

    }
}
