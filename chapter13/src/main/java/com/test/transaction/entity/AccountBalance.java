package com.test.transaction.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/27
 * @Description: 账户余额
 */
public class AccountBalance {
    /**
     * 主键
     */
    private int id;
    /**
     * 客户号
     */
    private int customerId;
    /**
     * 账户余额
     */
    private BigDecimal balance;
    /**
     * 创建时间
     */
    private Date addDate;
    /**
     * 修改时间
     */
    private Date updateDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
