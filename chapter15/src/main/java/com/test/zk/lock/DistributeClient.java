package com.test.zk.lock;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;

import java.util.concurrent.TimeUnit;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/09
 * @Description: 请求锁，使用资源，释放锁
 */
public class DistributeClient {
    private final InterProcessMutex lock;
    private final SharedResource resource;
    private final String clientName;

    public DistributeClient(CuratorFramework client, String lockPath, SharedResource resource, String clientName) {
        this.resource = resource;
        this.clientName = clientName;
        lock = new InterProcessMutex(client, lockPath);
    }

    /**
     * 客户端执行方法
     */
    public void doWork(long time, TimeUnit unit) throws Exception {
        // 加锁，带有超时时间，超过超市时间未获取到锁抛出异常
        if (!lock.acquire(time, unit)) {
            throw new IllegalStateException(clientName + "加锁失败");
        }
        try {
            System.out.println(clientName + "加锁成功");
            // 应用程序的业务逻辑部分
            resource.use();
        } finally {
            System.out.println(clientName + "释放锁");
            // 释放锁
            try {
                lock.release();
            } catch (Exception e) {

            }
        }
    }
}