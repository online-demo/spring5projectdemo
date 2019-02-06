package com.test.prototype;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description: 电脑接口
 */
public abstract class Computer implements Cloneable{
    protected String type;
    /**
     * 制造电脑的方法
     */
    void make() {

    }

    /**
     * 克隆方法
     */
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
