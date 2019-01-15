package com.test.zk.pubsub;


import com.test.zk.demo.ZookeeperClient;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.*;

import java.util.List;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/08
 * @Description: PathChildrenCache订阅
 */
public class PathChildrenCacheSubscriber {

    private ZookeeperClient zookeeperClient;

    private String name;
    public PathChildrenCacheSubscriber(String name, ZookeeperClient zookeeperClient) {
        this.name = name;
        this.zookeeperClient = zookeeperClient;
    }
    /**
     * 订阅
     */
    public void subscribe(String path) {
        PathChildrenCache pathChildrenCache = new PathChildrenCache(zookeeperClient.getCuratorFramework()
                , path, true);
        pathChildrenCache.getListenable().addListener((client, event) -> {
            // 当前节点的所有子节点
            List<ChildData> childDataList = pathChildrenCache.getCurrentData();
            for (ChildData childData : childDataList) {
                System.out.printf("%s监听子节点更新，当前子节点path=%s，子节点数据=%s%n"
                        ,name, childData.getPath(), new String(childData.getData()));
            }
        });
        try {
            pathChildrenCache.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
