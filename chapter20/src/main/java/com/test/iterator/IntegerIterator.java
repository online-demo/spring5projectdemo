package com.test.iterator;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description:
 */
public class IntegerIterator implements Iterator<Integer> {
    private Integer[] numbers;
    int index;
    public IntegerIterator (Integer[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        if (index < numbers.length) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            return numbers[index++];
        }
        return null;
    }
}
