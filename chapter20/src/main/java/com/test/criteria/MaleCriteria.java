package com.test.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 过滤男性
 */
public class MaleCriteria implements Criteria {
    @Override
    public List<Person> filter(List<Person> personList) {
        List<Person> filtered = new ArrayList<>();
        for (Person person : personList) {
            if ("Male".equals(person.getGender())) {
                filtered.add(person);
            }
        }
        return filtered;
    }
}
