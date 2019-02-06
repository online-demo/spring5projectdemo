package com.test.criteria;

import java.util.List;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description:
 */
public interface Criteria {
    List<Person> filter(List<Person> personList);
}
