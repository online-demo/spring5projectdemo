package com.test.zk.pubsub;

import com.test.zk.demo.ZookeeperClient;
import org.apache.zookeeper.data.Stat;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/08
 * @Description: 发布者
 */
public class Publisher {
    private ZookeeperClient zookeeperClient;

    public Publisher (ZookeeperClient zookeeperClient) {
        this.zookeeperClient = zookeeperClient;
    }
    /**
     * 发布信息
     */
    public void publish(String path, String data) {
        try {
            Stat status = zookeeperClient.getCuratorFramework().checkExists().forPath(path);
            if (status == null) {
                zookeeperClient.getCuratorFramework().create().creatingParentContainersIfNeeded()
                        .forPath(path, data.getBytes());
            } else {
                zookeeperClient.getCuratorFramework().setData().forPath(path, data.getBytes());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
