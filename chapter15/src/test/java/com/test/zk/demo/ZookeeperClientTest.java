package com.test.zk.demo;

import org.apache.zookeeper.CreateMode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/08
 * @Description: 测试ZooKeeper客户端
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-zookeeper.xml")
public class ZookeeperClientTest {
    @Autowired
    private ZookeeperClient zookeeperClient;

    @Test
    public void test() {
        String path = "/spring5/test";
        //保存
        zookeeperClient.save(path, "Spring5 Zookeeper Test", CreateMode.PERSISTENT);
        //查询
        String data = zookeeperClient.query(path);
        System.out.println("data = " + data);
    }
}
