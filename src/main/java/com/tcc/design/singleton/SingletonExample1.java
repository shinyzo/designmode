package com.tcc.design.singleton;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 8:58
 * 3 * @Descripiton:
 *  饿汉模式，线程安全的
 */
@ThreadSafe
@NotRecommend
public class SingletonExample1 {

    private static final SingletonExample1 INSTANCE = new SingletonExample1();

    private SingletonExample1(){

    }

    public static SingletonExample1 getInstance(){
        return INSTANCE;
    }
}
