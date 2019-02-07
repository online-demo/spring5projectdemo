package com.test.command;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 立正命令
 */
public class AttentionCommand implements Command {
    private Soldier soldier;

    public AttentionCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void doCommand() {
        soldier.attention();
    }
}
