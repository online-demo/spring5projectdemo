package com.test.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 员工类
 */
public class Staff {
    private int id;
    private String name;
    private String dept;
    private List<Staff> subordinateList;
    public Staff(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        subordinateList = new ArrayList<>();
    }

    public void addSubordinate(Staff staff) {
        subordinateList.add(staff);
    }

    public List<Staff> getSubordinates(){
        return subordinateList;
    }

    public String toString(){
        return ("Employee :[ id : "+ id
                +", name : "+ name + ", dept : "
                + dept+" ]");
    }
}
