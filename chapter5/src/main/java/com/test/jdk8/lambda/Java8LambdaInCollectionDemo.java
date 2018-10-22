package com.test.jdk8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author zhouguanya
 * @Date 2018/10/12
 * @Description 集合元素排序
 */
public class Java8LambdaInCollectionDemo {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person personLi = new Person("李四", 22);
        Person personZhang = new Person("张三",20);
        Person personWang = new Person("王五", 26);
        personList.add(personLi);
        personList.add(personZhang);
        personList.add(personWang);
        //按年龄从小到大排序
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(personList);
        //使用Lambda表达式，按年龄从大到小排序
        Collections.sort(personList, (o1, o2) -> o2.age - o1.age);
        System.out.println(personList);
        //使用Lambda表达式，按年龄从小到大排序
        Collections.sort(personList, Comparator.comparingInt(o -> o.age));
        System.out.println(personList);
    }
}
