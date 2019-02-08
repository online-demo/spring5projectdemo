package com.test.nullobject;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 对象工厂
 */
public class ObjectFactory {
    public static final String[] names = {"table", "light", "bed"};
    public static AbstractObject getObject(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealObject(name);
            } else {
                return new NullObject(name);
            }
        }
        return new NullObject("");
    }
}
