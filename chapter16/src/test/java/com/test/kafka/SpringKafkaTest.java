package com.test.kafka;

import com.test.kafka.producer.MessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/14
 * @Description: 单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-kafka.xml")
public class SpringKafkaTest {
    @Autowired
    private MessageProducer messageProducer;
    @Test
    public void sendMessage() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            messageProducer.send("spring-kafka-test", "Hello Kafka");

        }
        Thread.sleep(1000);
    }
}
