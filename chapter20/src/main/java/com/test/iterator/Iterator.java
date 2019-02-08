package com.test.iterator;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 迭代器接口
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
