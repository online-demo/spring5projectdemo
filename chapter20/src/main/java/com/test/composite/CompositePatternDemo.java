package com.test.composite;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 组合模式测试类
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Staff boss = new Staff(1, "Tom", "Boss");
        Staff cto = new Staff(2,"John", "IT");
        Staff salesDirector = new Staff(3,"Robert", "Marketing");
        boss.addSubordinate(cto);
        boss.addSubordinate(salesDirector);
        Staff engineer1 = new Staff(4,"Bob", "IT");
        Staff engineer2 = new Staff(5,"Michael", "IT");
        cto.addSubordinate(engineer1);
        cto.addSubordinate(engineer2);
        Staff salesExecutive1 = new Staff(6,"Richard", "Marketing");
        Staff salesExecutive2 = new Staff(7,"Rob", "Marketing");
        salesDirector.addSubordinate(salesExecutive1);
        salesDirector.addSubordinate(salesExecutive2);
        //打印该组织的所有员工
        System.out.println(boss);
        for (Staff manager : boss.getSubordinates()) {
            System.out.println(manager);
            for (Staff staff : manager.getSubordinates()) {
                System.out.println(staff);
            }
        }
    }
}
