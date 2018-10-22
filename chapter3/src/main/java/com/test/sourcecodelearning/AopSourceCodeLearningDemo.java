package com.test.sourcecodelearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/100/3
 * @Description 测试
 */
public class AopSourceCodeLearningDemo {
    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-sourcecodelearning.xml");
        //获取目标对象
        Log target = (Log) context.getBean("proxyFactoryBean");
        //执行目标对象的方法
        target.printLog();
    }
}
