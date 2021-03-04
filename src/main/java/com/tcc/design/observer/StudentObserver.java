package com.tcc.design.observer;

/**
 * @Author: zhangliangming
 * @Date: 2021/3/4 21:53.
 * Description:
 */
public class StudentObserver implements IObserver {

    @Override
    public void notice() {
        System.out.println("学生停止讲话，做好姿势，看书");
    }
}