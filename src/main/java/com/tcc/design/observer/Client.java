package com.tcc.design.observer;

/**
 * @Author: zhangliangming
 * @Date: 2021/3/4 21:56.
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        IObserver observer = new StudentObserver();
        teacher.add(observer);
        teacher.dosomething();
    }
}