package com.test.zk.demo;

import com.test.zk.pubsub.Publisher;
import com.test.zk.pubsub.TreeCacheSubscriber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/08
 * @Description: TreeCacheSubscriber发布订阅测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-zookeeper.xml")
public class TreeCachePubSubTest {

    @Autowired
    private ZookeeperClient zookeeperClient;

    @Test
    public void test() throws InterruptedException {
        String basePath = "/TreeCache/PubSub";
        String firstPath = basePath + "/first";
        String secondPath = firstPath + "/second";
        String thirdPath = secondPath + "/third";
        Publisher publisher = new Publisher(zookeeperClient);
        //写入数据100
        publisher.publish(basePath, String.valueOf(100));
        TreeCacheSubscriber subscriber1 = new TreeCacheSubscriber("订阅者1", zookeeperClient);
        subscriber1.subscribe(basePath);
        TreeCacheSubscriber subscriber2 = new TreeCacheSubscriber("订阅者2", zookeeperClient);
        subscriber2.subscribe(basePath);
        //创建节点:/PathChildrenCache/PubSub/first
        publisher.publish(firstPath, String.valueOf(200));
        Thread.sleep(100);
        System.out.println("-----------------------分割线-----------------------");
        //创建节点:/PathChildrenCache/PubSub/first/second
        publisher.publish(secondPath, String.valueOf(300));
        Thread.sleep(100);
        System.out.println("-----------------------分割线-----------------------");
        //创建节点:/PathChildrenCache/PubSub/first/second/third
        publisher.publish(thirdPath, String.valueOf(400));
    }

}
