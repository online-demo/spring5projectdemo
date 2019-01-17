package com.test.mycat;

import com.alibaba.fastjson.JSON;
import com.test.mycat.dao.CustomerOrderDao;
import com.test.mycat.model.CustomerOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/04
 * @Description: CustomerOrderDao分表测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mycat.xml")
public class CustomerOrderDaoTest {
    @Autowired
    private CustomerOrderDao customerOrderDao;
    @Test
    public void testSave() {
        CustomerOrder customerOrder_1 = new CustomerOrder();
        customerOrder_1.setId(1);
        customerOrder_1.setAmount(100);
        customerOrderDao.save(customerOrder_1);
        CustomerOrder customerOrder_2 = new CustomerOrder();
        customerOrder_2.setId(2);
        customerOrder_2.setAmount(200);
        customerOrderDao.save(customerOrder_2);
        CustomerOrder customerOrder_3 = new CustomerOrder();
        customerOrder_3.setId(3);
        customerOrder_3.setAmount(300);
        customerOrderDao.save(customerOrder_3);
    }

    @Test
    public void testQuery() {
        System.out.println("订单1=" + JSON.toJSONString(customerOrderDao.query(1)));
        System.out.println("订单2=" + JSON.toJSONString(customerOrderDao.query(2)));
        System.out.println("订单3=" + JSON.toJSONString(customerOrderDao.query(3)));
    }
}
