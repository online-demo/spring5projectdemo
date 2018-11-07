package com.test.chapter6webflux.model;

/**
 * @Author zhouguanya
 * @Date 2018/11/07
 * @Description user实体
 */
public class User {
    /** id */
    private Long id;
    /** 姓名 */
    private String name;

    /** 构造器 */
    public User(Long uid, String name) {
        this.id = uid;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** 重写toString方法 */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name;
    }
}
