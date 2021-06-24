package com.tcc.design.state;

/**
 * Author: liangming.zhang
 * Date : 2021/6/24 - 9:36
 * Description:
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("has one quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("客户退款25元");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println("状态转换:hasQuarterState -> noQuarterState");
    }

    @Override
    public void turnCrank() {
        System.out.println("==> 客户摇动曲柄");
        gumballMachine.setState(gumballMachine.getSoldState());
        System.out.println("状态转换:hasQuarterState -> soldState");
    }

    @Override
    public void dispense() {
        System.out.println("can not dispense ,wait minute");
    }
}
