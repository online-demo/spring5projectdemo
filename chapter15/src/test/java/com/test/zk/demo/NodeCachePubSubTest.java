package com.test.zk.demo;

import com.test.zk.pubsub.Publisher;
import com.test.zk.pubsub.NodeCacheSubscriber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/08
 * @Description: 发布订阅测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-zookeeper.xml")
public class NodeCachePubSubTest {
    @Autowired
    private ZookeeperClient zookeeperClient;
    @Test
    public void test() throws InterruptedException {
        String path = "/NodeCache/PubSub";
        Publisher publisher = new Publisher(zookeeperClient);
        //写入数据100
        publisher.publish(path, String.valueOf(100));
        NodeCacheSubscriber subscriber1 = new NodeCacheSubscriber("订阅者1", zookeeperClient);
        subscriber1.subscribe(path);
        NodeCacheSubscriber subscriber2 = new NodeCacheSubscriber("订阅者2", zookeeperClient);
        subscriber2.subscribe(path);
        Thread.sleep(100);
        System.out.println("----------------分割线----------------");
        //更细数据200
        publisher.publish(path, String.valueOf(200));
    }
}
