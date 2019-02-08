package com.test.iterator;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 迭代器模式测试类
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        Integer numbers[] = {1, 2, 3, 4, 5};
        IntegerRepository repository = new IntegerRepository(numbers);
        Iterator iterator = repository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
