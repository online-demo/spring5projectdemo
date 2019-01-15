package com.test.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/14
 * @Description: 消息消费者
 */
@Component
public class MessageConsumer implements MessageListener<String, String> {

    /**
     * 消费组监听消息
     */
    @Override
    public void onMessage(ConsumerRecord<String, String> data) {
        System.out.printf("监听到消息：topic=%s,value=%s%n", data.topic(), data.value());
    }
}
