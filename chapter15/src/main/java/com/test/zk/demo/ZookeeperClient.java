package com.test.zk.demo;

import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/08
 * @Description: 自定义Zookeeper客户端
 */
public class ZookeeperClient {
    /**
     * Zookeeper客户端
     */
    private CuratorFramework curatorFramework = null;

    public CuratorFramework getCuratorFramework() {
        return curatorFramework;
    }

    /**
     * 构造函数输入
     */
    public ZookeeperClient(CuratorFramework curatorFramework) {
        this.curatorFramework = curatorFramework;
    }

    /**
     * 创建节点
     */
    public void save(String path, String data, CreateMode createMode) {
        try {
            curatorFramework.create().creatingParentContainersIfNeeded()
                    .withMode(createMode).forPath(path, data.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询节点信息
     */
    public String query(String path) {
        try {
           byte[] data = curatorFramework.getData().forPath(path);
           if (data != null && data.length > 0) {
               return new String(data);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}