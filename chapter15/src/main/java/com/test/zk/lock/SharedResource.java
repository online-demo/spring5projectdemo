package com.test.zk.lock;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/09
 * @Description: 模拟一个共享资源，只能单线程访问
 */
public class SharedResource {
    private final AtomicBoolean shareResourceInUse = new AtomicBoolean(false);

    public void use() throws InterruptedException {
        // 真实环境中我们会在这里访问/维护一个共享的资源
        if (!shareResourceInUse.compareAndSet(false, true)) {
            throw new IllegalStateException("Needs to be used by one client at a time");
        }
        try {
            System.out.println("共享资源操作中");
            Thread.sleep(1);
        } finally {
            shareResourceInUse.set(false);
        }
    }
}
