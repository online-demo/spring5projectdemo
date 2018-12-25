package com.test.mybatis.entity;


import java.util.Date;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/24
 * @Description: 客户实体类
 */
public class Customer {
    /**
     * 客户号
     */
    private int id;
    /**
     * 客户姓名
     */
    private String name;
    /**
     * 客户手机号
     */
    private String phone;
    /**
     * 添加时间
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
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
