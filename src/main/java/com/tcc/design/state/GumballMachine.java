package com.tcc.design.state;

/**
 * Author: liangming.zhang
 * Date : 2021/6/24 - 9:44
 * Description:
 */
public class GumballMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State state = soldOutState;
    int numberGumballs = 0;

    public GumballMachine(int numberGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);

        this.numberGumballs = numberGumballs;
        if(numberGumballs > 0){
            state = noQuarterState;
        }
    }


    public void insertQuarter(){
        state.insertQuarter();
    }

    void ejectQuarter(){
        state.ejectQuarter();
    }

    void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void releaseBall(){
        if(this.numberGumballs>0){
            this.numberGumballs = this.numberGumballs-1;
        }

    }


    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getNumberGumballs() {
        return numberGumballs;
    }

    public void setNumberGumballs(int numberGumballs) {
        this.numberGumballs = numberGumballs;
    }
}
