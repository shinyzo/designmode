package com.tcc.design.adapter.duck;

/**
 * Author: liangming.zhang
 * Date : 2021/6/24 - 15:48
 * Description:
 */
public class QuackCounter implements Quackable {

    Quackable quackable;

    private static int count = 0;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        System.out.println("====>");
        count ++;
    }

    public static int getCount() {
        return count;
    }
}
