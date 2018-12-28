package com.test.transaction;

import com.test.transaction.dao.AccountBalanceDao;
import com.test.transaction.entity.AccountBalance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/27
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transaction-mybatis.xml")
public class AccountTransactionTest {
    @Autowired
    private AccountBalanceDao accountBalanceDao;

    /**
     * 插入一条测试记录
     */
    @Test
    public void testSave() {
        AccountBalance accountBalance = new AccountBalance();
        accountBalance.setCustomerId(1);
        accountBalance.setBalance(new BigDecimal(10));
        accountBalanceDao.saveAccountBalance(accountBalance);
    }
    /**
     * 测试不使用事务
     */
    @Test
    public void testUpdateWithoutTransaction() {
        AccountBalance accountBalance = new AccountBalance();
        accountBalance.setCustomerId(1);
        accountBalance.setBalance(new BigDecimal(20));
        accountBalanceDao.updateAccountBalance(accountBalance);
        //模拟异常
        int x = 1 / 0;
        accountBalance.setBalance(new BigDecimal(50));
        accountBalanceDao.updateAccountBalance(accountBalance);
    }
    /**
     * 测试使用事务
     */
    @Test
    @Transactional
    public void testUpdateWithTransaction() {
        AccountBalance accountBalance = new AccountBalance();
        accountBalance.setCustomerId(1);
        accountBalance.setBalance(new BigDecimal(50));
        accountBalanceDao.updateAccountBalance(accountBalance);
        //模拟异常
        int x = 1 / 0;
        accountBalance.setBalance(new BigDecimal(100));
        accountBalanceDao.updateAccountBalance(accountBalance);
    }
}
