package com.tcc.design.command;

/**
 * Author: liangming.zhang
 * Date : 2021/6/22 - 17:13
 * Description:
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
