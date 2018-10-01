package com.test.sourcecodelearning;

import com.test.ioc.xml.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/8/14
 * @Description IoC源码解析
 */
public class SourceCodeLearning {
    public static void main(String[] args) {
        //ApplicationContext：Spring的上下文。通过对源码的类的集成关系可以看出，
        // FileSystemXmlApplicationContext是ApplicationContext的一个标准实现
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("classpath:spring-chapter2.xml");
        //从容器中获取名字为user的bean
        PressService pressService =
                (PressService) applicationContext.getBean("pressService");
        //调用bean的方法
        String price = pressService.say();
        System.out.println(price);
    }
}
