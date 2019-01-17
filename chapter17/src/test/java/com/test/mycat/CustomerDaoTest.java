package com.test.mycat;

import com.alibaba.fastjson.JSON;
import com.test.mycat.dao.CustomerDao;
import com.test.mycat.model.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/04
 * @Description: CustomerDao测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mycat.xml")
public class CustomerDaoTest {
    @Autowired
    private CustomerDao customerDao;
    @Test
    public void testSave() {
        Customer customer_1 = new Customer();
        customer_1.setId(1);
        customer_1.setName("Michael");
        customer_1.setPhone("3344625292");
        customerDao.save(customer_1);
        Customer customer_2 = new Customer();
        customer_2.setId(2);
        customer_2.setName("Tom");
        customer_2.setPhone("3190976240");
        customerDao.save(customer_2);
    }
    @Test
    public void testQuery() {
        System.out.println("用户1=" + JSON.toJSONString(customerDao.query(1)));
        System.out.println("用户2=" + JSON.toJSONString(customerDao.query(2)));

    }
}
