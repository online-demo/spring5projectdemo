package com.test.dubbo.consumer;

import com.test.dubbo.api.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/31
 * @Description: 测试服务调用者
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-consumer.xml")
public class DubboConsumerTest {
    @Autowired
    private HelloService helloService;
    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(helloService.sayHello("Michael"));
        }
    }
}
