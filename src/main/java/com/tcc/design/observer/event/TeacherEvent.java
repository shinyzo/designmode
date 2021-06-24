package com.tcc.design.observer.event;

/**
 * Author: liangming.zhang
 * Date : 2021/5/26 - 9:33
 * Description:
 */
public class TeacherEvent implements Event {

    public TeacherEvent() {
    }

    @Override
    public void dosomething() {
        System.out.println("teacher is coming");
    }
}
