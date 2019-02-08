package com.test.iterator;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description:
 */
public class IntegerRepository implements Container {
    private Integer[] numbers;

    public IntegerRepository (Integer[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator getIterator() {
        return new IntegerIterator(numbers);
    }
}
