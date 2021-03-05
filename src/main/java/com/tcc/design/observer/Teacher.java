package com.tcc.design.observer;

/**
 * @Author: zhangliangming
 * @Date: 2021/3/4 21:54.
 * Description:
 */
public class Teacher extends Subject {

    @Override
    public void dosomething() {
        System.out.println("老师来了");
        super.dosomething();
    }
}