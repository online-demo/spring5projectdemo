package com.test.dubbo.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.test.dubbo.api.HelloService;

import java.time.LocalDateTime;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/31
 * @Description:
 */
public class HelloServiceImpl implements HelloService {
    /**
     * sayHello方法实现
     */
    @Override
    public String sayHello(String name) {
        System.out.println(LocalDateTime.now() + "  hello" + name + ", response from provider: " + RpcContext.getContext().getLocalAddress());
        return "hello " + name;
    }
}
