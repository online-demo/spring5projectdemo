package com.test.jdk8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author zhouguanya
 * @Date 2018/10/12
 * @Description Stream中使用Lambda
 */
public class Java8LambdaInStreamDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>() {
            {
                add(new Person("张三", 24));
                add(new Person("李四", 32));
                add(new Person("王五", 28));
                add(new Person("赵六", 26));
                add(new Person("赵七", 30));
            }
        };
        //使用stream和Lambda对personList进行排序
        List<Person> sortedList = personList.stream()
                .sorted(Comparator.comparingInt(p -> p.age))
                .limit(5).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
