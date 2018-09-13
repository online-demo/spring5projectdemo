package com.test.aspectj.expression.args;

import com.test.aspectj.expression.FoodFactory;
import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description 食品工厂
 */
@Listen
@Component
public class FreshFoodFactory extends FoodFactory {

}
