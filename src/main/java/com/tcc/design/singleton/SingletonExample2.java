package com.tcc.design.singleton;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 9:00
 * 3 * @Descripiton:
 * 懒汉模式，线程不安全
 */
@NotThreadSafe
@NotRecommend
public class SingletonExample2 {

    private static SingletonExample2 instance = null;


    private SingletonExample2(){

    }

    public static SingletonExample2 getInstance(){
        if(instance == null){
            instance = new SingletonExample2();
        }

        return instance;
    }


}
