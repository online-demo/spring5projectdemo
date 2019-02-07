package com.test.command;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 稍息命令
 */
public class StandEaseCommand implements Command {
    private Soldier soldier;

    public StandEaseCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void doCommand() {
        soldier.standAtEase();
    }
}
