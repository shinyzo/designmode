package com.tcc.design.command;

/**
 * Author: liangming.zhang
 * Date : 2021/6/22 - 17:13
 * Description:
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
