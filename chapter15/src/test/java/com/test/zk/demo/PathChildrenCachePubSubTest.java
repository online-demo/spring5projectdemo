package com.test.zk.demo;

import com.test.zk.pubsub.PathChildrenCacheSubscriber;
import com.test.zk.pubsub.Publisher;
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
public class PathChildrenCachePubSubTest {

    @Autowired
    private ZookeeperClient zookeeperClient;

    @Test
    public void test() throws InterruptedException {
        String basePath = "/PathChildrenCache/PubSub";
        String firstPath = basePath + "/first";
        String secondPath = basePath + "/second";
        Publisher publisher = new Publisher(zookeeperClient);
        //写入数据100
        publisher.publish(basePath, String.valueOf(100));
        PathChildrenCacheSubscriber subscriber1 = new PathChildrenCacheSubscriber("订阅者1", zookeeperClient);
        subscriber1.subscribe(basePath);
        PathChildrenCacheSubscriber subscriber2 = new PathChildrenCacheSubscriber("订阅者2", zookeeperClient);
        subscriber2.subscribe(basePath);
        //创建节点:/PathChildrenCache/PubSub/first
        publisher.publish(firstPath, String.valueOf(200));
        Thread.sleep(100);
        System.out.println("-----------------------分割线-----------------------");
        //创建节点:/PathChildrenCache/PubSub/second
        publisher.publish(secondPath, String.valueOf(300));
    }

}
