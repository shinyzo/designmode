package com.tcc.design.adapter.duck;

/**
 * Author: liangming.zhang
 * Date : 2021/6/24 - 15:43
 * Description:
 */
public class ReadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("ga ga ga");
    }
}
