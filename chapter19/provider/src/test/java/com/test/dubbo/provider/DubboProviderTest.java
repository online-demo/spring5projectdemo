package com.test.dubbo.provider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/31
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-provider.xml")
public class DubboProviderTest {
    @Test
    public void start_provider_1() throws Exception {
        System.out.println("Dubbo Provider 1 started successfully...");
        System.in.read();
    }
}
