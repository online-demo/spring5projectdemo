package com.test.memento;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description:
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
}
