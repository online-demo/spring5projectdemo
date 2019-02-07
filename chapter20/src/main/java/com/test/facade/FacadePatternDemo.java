package com.test.facade;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 测试类
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.makeLenovo();
        computerFacade.makeASUS();
        computerFacade.makeMacBook();
    }
}
