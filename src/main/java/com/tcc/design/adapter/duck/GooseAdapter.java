package com.tcc.design.adapter.duck;

/**
 * Author: liangming.zhang
 * Date : 2021/6/24 - 15:44
 * Description:
 */
public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.hank();
    }
}
