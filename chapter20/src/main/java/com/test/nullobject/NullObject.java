package com.test.nullobject;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description:
 */
public class NullObject implements AbstractObject {
    private String name;
    public NullObject(String name) {
        this.name = name;
    }
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void show() {
        // do nothing
        System.out.println(name + " Object not exist");
    }
}
