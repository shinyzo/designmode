package com.tcc.design.state;

/**
 * Author: liangming.zhang
 * Date : 2021/6/24 - 9:36
 * Description:
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("please wait ,we are already given you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("please wait ,we are already given you a gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("please wait ,we are already given you a gumball");
    }

    @Override
    public void dispense() {
        System.out.println("==> 发放糖果");
        gumballMachine.releaseBall();
        if(gumballMachine.getNumberGumballs()>0){
            System.out.println("==> 发放糖果成功，状态转换至：->NoQuarterState ");
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("==> 糖果售罄，状态转换至：-> soldOutState ");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
