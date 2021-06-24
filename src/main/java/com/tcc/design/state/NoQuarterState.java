package com.tcc.design.state;

/**
 * Author: liangming.zhang
 * Date : 2021/6/24 - 9:36
 * Description:
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("客户投入25元");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("状态转换至: NoQuarterState -> hasQuarterState");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("no quarter ,can not eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("no quarter ,can not turn");
    }

    @Override
    public void dispense() {
        System.out.println("no quarter ,can not dispense");
    }
}
