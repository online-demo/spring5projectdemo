package com.test.transaction.dao;

import com.test.transaction.entity.AccountBalance;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/27
 * @Description: MyBatis会通过动态代理注入
 */
public interface AccountBalanceDao {
    /**
     * 查询账户余额
     */
    int queryAccountByCustomerId(int id);

    /**
     * 保存账户余额
     */
    int saveAccountBalance(AccountBalance accountBalance);

    /**
     * 更新账户余额
     */
    int updateAccountBalance(AccountBalance accountBalance);
}
