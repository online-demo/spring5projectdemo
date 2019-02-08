package com.test.nullobject;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 空对象模式实现类
 */
public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractObject object1 = ObjectFactory.getObject("light");
        AbstractObject object2 = ObjectFactory.getObject("bed");
        AbstractObject object3 = ObjectFactory.getObject("table");
        AbstractObject object4 = ObjectFactory.getObject("sun");
        object1.show();
        object2.show();
        object3.show();
        object4.show();
    }
}
