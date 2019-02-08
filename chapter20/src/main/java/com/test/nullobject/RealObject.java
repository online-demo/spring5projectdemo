package com.test.nullobject;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description:
 */
public class RealObject implements AbstractObject {
    private String name;
    public RealObject(String name) {
        this.name = name;
    }
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public void show() {
        System.out.println("real object " + name + " shows now");
    }
}
