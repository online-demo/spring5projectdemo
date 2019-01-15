package com.test.zk.pubsub;


import com.test.zk.demo.ZookeeperClient;
import org.apache.curator.framework.recipes.cache.ChildData;
import org.apache.curator.framework.recipes.cache.TreeCache;


/**
 * @Author: zhouguanya
 * @Date: 2019/01/08
 * @Description: TreeCache订阅
 */
public class TreeCacheSubscriber {

    private ZookeeperClient zookeeperClient;

    private String name;
    public TreeCacheSubscriber(String name, ZookeeperClient zookeeperClient) {
        this.name = name;
        this.zookeeperClient = zookeeperClient;
    }
    /**
     * 订阅
     */
    public void subscribe(String path) {
        // 创建TreeCache并前天最大深度为2
        TreeCache treeCache = TreeCache.newBuilder(zookeeperClient.getCuratorFramework(), path)
                .setCacheData(true).setMaxDepth(2).build();
        treeCache.getListenable().addListener((client, event) -> {
            ChildData data = event.getData();
            System.out.printf("%s监听到节点变更，节点路径=%s，节点值=%s%n", name, data.getPath(),
                    new String(data.getData()));

        });
        try {
            treeCache.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
