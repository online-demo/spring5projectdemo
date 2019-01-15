package com.test.zk.pubsub;


import com.test.zk.demo.ZookeeperClient;
import org.apache.curator.framework.recipes.cache.NodeCache;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/08
 * @Description: NodeCache订阅
 */
public class NodeCacheSubscriber {

    private ZookeeperClient zookeeperClient;

    private String name;
    public NodeCacheSubscriber(String name, ZookeeperClient zookeeperClient) {
        this.name = name;
        this.zookeeperClient = zookeeperClient;
    }
    /**
     * 订阅
     */
    public void subscribe(String path) {
        NodeCache nodeCache = new NodeCache(zookeeperClient.getCuratorFramework(), path);
        nodeCache.getListenable().addListener(() ->
                System.out.printf("%s监听到节点信息发生变化，当前数据=%s%n", name,
                        new String(nodeCache.getCurrentData().getData())));
        try {
            nodeCache.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
