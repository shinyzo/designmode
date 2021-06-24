package com.tcc.design.state;

/**
 * Author: liangming.zhang
 * Date : 2021/6/24 - 9:36
 * Description:
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("sorry,sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry,sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("sorry,sold out");
    }

    @Override
    public void dispense() {
        System.out.println("sorry,sold out");
    }
}
