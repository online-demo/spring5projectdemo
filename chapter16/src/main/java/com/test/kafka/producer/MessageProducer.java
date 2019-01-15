package com.test.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/14
 * @Description: 消息生产者
 */
@Component
public class MessageProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * 发送消息
     * @param topic 主题
     * @param value 消息
     */
    public void send(String topic, String value) {
        kafkaTemplate.send(topic, value);
    }
}
