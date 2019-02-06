package com.test.bridge;

import com.test.common.ASUS;
import com.test.common.Lenovo;
import com.test.common.MacBook;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 桥接设计模式测试
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        ComputerBridge asus = new ComputerBridge(new ASUS());
        asus.makeComputer();
        ComputerBridge lenove = new ComputerBridge(new Lenovo());
        lenove.makeComputer();
        ComputerBridge macBook = new ComputerBridge(new MacBook());
        macBook.makeComputer();
    }
}
