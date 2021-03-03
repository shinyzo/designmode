package com.tcc.design.singleton;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 9:00
 * 3 * @Descripiton:
 * 懒汉模式，线程安全,性能较差 synchronized
 */
@ThreadSafe
@NotRecommend
public class SingletonExample3 {

    private static SingletonExample3 instance = null;


    private SingletonExample3(){

    }

    public synchronized static SingletonExample3 getInstance(){
        if(instance == null){
            instance = new SingletonExample3();
        }

        return instance;
    }


}
