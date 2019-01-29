package com.test.sharding.entity;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/19
 * @Description: 商户信息
 */
public class ShopInfo {
    /**
     * 商户id
     */
    private Long shopId;

    /**
     * 商户名
     */
    private String shopName;

    /**
     * 商户账户
     */
    private String account;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getUserName() {
        return shopName;
    }

    public void setUserName(String userName) {
        this.shopName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
