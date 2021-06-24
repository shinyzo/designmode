package com.tcc.design.command;

/**
 * Author: liangming.zhang
 * Date : 2021/6/22 - 17:18
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        Customer customer = new Customer();
        customer.setCommand(0,lightOnCommand);
        customer.setCommand(1,lightOffCommand);
        customer.pressButton(0);
        customer.undoButton();
        customer.pressButton(1);
        customer.undoButton();

        customer.pressButton(3);
    }
}
