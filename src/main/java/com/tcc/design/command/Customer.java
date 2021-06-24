package com.tcc.design.command;

/**
 * Author: liangming.zhang
 * Date : 2021/6/22 - 17:15
 * Description:
 */
public class Customer {

    private Command[] commands;
    private Command undoCommand;
    private int slotSize =10;

    public Customer() {
        commands = new Command[slotSize];
        for(int i=0;i<slotSize;i++){
            commands[i] = new NoCommand();
        }

    }

    public void setCommand(int slot,Command command){
        if(slot < 0) slot = 0;
        if(slot > slotSize-1 ){
            throw new RuntimeException("not more slot,slot size"+slotSize);
        }
        commands[slot] = command;
    }



    public void pressButton(int slot){
        commands[slot].execute();
        undoCommand = commands[slot];
    }

    public void undoButton(){
        undoCommand.undo();
    }



}
