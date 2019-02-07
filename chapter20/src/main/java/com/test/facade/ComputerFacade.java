package com.test.facade;

import com.test.common.ASUS;
import com.test.common.Computer;
import com.test.common.Lenovo;
import com.test.common.MacBook;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 门面
 */
public class ComputerFacade {
    private Computer lenovo;
    private Computer asus;
    private Computer macBook;
    public ComputerFacade() {
        lenovo = new Lenovo();
        asus = new ASUS();
        macBook = new MacBook();
    }
    public void makeLenovo(){
        lenovo.make();
    }
    public void makeASUS(){
        asus.make();
    }
    public void makeMacBook(){
        macBook.make();
    }
}
