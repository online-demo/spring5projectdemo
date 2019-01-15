package com.test.zk.lock;

import com.test.zk.demo.ZookeeperClient;
import org.apache.curator.utils.CloseableUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/09
 * @Description: 单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-zookeeper.xml")
public class DistributeLockTest {
    private static final int QTY = 5;
    private static final String PATH = "/lock/lock-";
    @Autowired
    private ZookeeperClient zookeeperClient;
    @Test
    public void test() throws Exception {
        final SharedResource resource = new SharedResource();
        // 线程池
        ExecutorService service = Executors.newFixedThreadPool(QTY);
        try {
            // 5个线程并发
            for (int i = 0; i < QTY; ++i) {
                final int index = i;
                Runnable task = () -> {
                    try {
                        // 每个线程都通过DistributeClient操作共享资源
                        final DistributeClient client = new DistributeClient(zookeeperClient.getCuratorFramework()
                                , PATH, resource, "Client " + index);
                            client.doWork(10, TimeUnit.SECONDS);
                    } catch (Throwable e) {
                        e.printStackTrace();
                    } finally {
                        CloseableUtils.closeQuietly(zookeeperClient.getCuratorFramework());
                    }
                };
                service.submit(task);
            }
            service.shutdown();
            service.awaitTermination(10, TimeUnit.MINUTES);
        } finally {
            CloseableUtils.closeQuietly(zookeeperClient.getCuratorFramework());
        }
    }
}
