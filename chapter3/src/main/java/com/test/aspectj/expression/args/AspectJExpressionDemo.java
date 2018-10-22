package com.test.aspectj.expression.args;

import com.test.aspectj.expression.Factory;
import com.test.aspectj.expression.FoodFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/9/100
 * @Description 测试args()
 */
public class AspectJExpressionDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-aspectjargsexpression.xml");
        FoodFactory foodFactory = (FoodFactory) context.getBean("foodFactory");
        foodFactory.delivery("上海");
        System.out.println("-----分割线-----");
        Factory phoneFactory = (Factory) context.getBean("phoneFactory");
        phoneFactory.delivery("北京");
        System.out.println("-----分割线-----");
        FreshFoodFactory freshFoodFactory = (FreshFoodFactory) context.getBean("freshFoodFactory");
        freshFoodFactory.testArgsAnnotation(freshFoodFactory);
        System.out.println("-----分割线-----");
        FrozenFoodFactory frozenFoodFactory = (FrozenFoodFactory) context.getBean("frozenFoodFactory");
        frozenFoodFactory.testArgsAnnotation(frozenFoodFactory);
    }
}
