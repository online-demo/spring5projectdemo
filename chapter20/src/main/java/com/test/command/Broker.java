package com.test.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 命令的调用类
 */
public class Broker {
    private List<Command> commandList = new ArrayList<>();

    /**
     * 添加命令
     */
    public void addCommand(Command command) {
        commandList.add(command);
    }

    /**
     * 执行命令
     */
    public void executeCommand() {
        for (Command command : commandList) {
            command.doCommand();
        }
    }
}
