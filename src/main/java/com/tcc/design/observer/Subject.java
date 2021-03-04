package com.tcc.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangliangming
 * @Date: 2021/3/4 21:49.
 * Description:
 */
public class Subject {

    private List<IObserver> observerList = new ArrayList<>();

    public void add(IObserver observer){
        observerList.add(observer);
    }

    public void remove(IObserver observer){
        observerList.remove(observer);
    }

    public void watch(){
        for(IObserver observer:observerList){
            observer.notice();
        }
    }

    public void coming(){
        watch();
    }

}