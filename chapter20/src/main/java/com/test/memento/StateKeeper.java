package com.test.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 状态管理类
 */
public class StateKeeper {
    private List<Memento> mementoList = new ArrayList<>();

    public void addState(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
