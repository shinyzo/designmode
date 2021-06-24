package com.tcc.design.adapter.duck;

/**
 * Author: liangming.zhang
 * Date : 2021/6/24 - 15:45
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        Goose goose = new Goose();
        Quackable quackable = new GooseAdapter(goose);
        quackable.quack();

        Quackable quackable1 = new ReadDuck();
        quackable1.quack();


        QuackCounter quackable2 = new QuackCounter(new GooseAdapter(goose));
        Quackable quackable3 = new ReadDuck();
        Quackable quackable4 = new QuackCounter(new ReadDuck());
        quackable2.quack();
        quackable3.quack();
        quackable4.quack();
        System.out.println(QuackCounter.getCount());

    }
}
