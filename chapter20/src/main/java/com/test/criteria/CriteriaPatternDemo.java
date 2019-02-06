package com.test.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description:
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Michael", 18, "Male"));
        persons.add(new Person("Tom", 24, "Female"));
        persons.add(new Person("Robert", 22, "Male"));
        persons.add(new Person("John", 19, "Female"));
        persons.add(new Person("Bobby", 25, "Male"));
        Criteria maleCriteria = new MaleCriteria();
        printPersons(maleCriteria.filter(persons));
        System.out.println("-------------分割线-------------");
        Criteria ageCriteria = new AgeCriteria();
        printPersons(ageCriteria.filter(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Age : " + person.getAge()
                    +" ]");
        }
    }
}
