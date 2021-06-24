package com.tcc.design.observer.event;

/**
 * Author: liangming.zhang
 * Date : 2021/5/26 - 9:32
 * Description:
 */
public class StudentListener implements Listener {

    @Override
    public void onEvent(Event e) {

        System.out.println("回座位");

    }
}
