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
    public void startProvider() throws Exception {
        System.out.println("Dubbo Provider started successfully...");
        System.in.read();
    }
}
