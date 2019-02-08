package com.test.memento;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 原始类
 */
public class Original {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveMementoState() {
        return new Memento(state);
    }

    public void getMementoState(Memento memento) {
        state = memento.getState();
    }
}
