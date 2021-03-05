package com.tcc.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangliangming
 * @Date: 2021/3/4 21:49.
 * Description: 观察者
 */
public class Subject {

    private List<IObserver> observerList = new ArrayList<>();

    public void add(IObserver observer){
        observerList.add(observer);
    }

    public void remove(IObserver observer){
        observerList.remove(observer);
    }

    // 通知观察者
    public void notice(){
        for(IObserver observer:observerList){
            observer.notice();
        }
    }

    // 被观察者举动
    public void dosomething(){
        notice();
    }

}