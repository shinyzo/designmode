package com.tcc.design.singleton;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 9:00
 * 3 * @Descripiton:
 *   双重锁检测机制，线程安全,
 *
 */
@ThreadSafe
@NotRecommend
public class SingletonExample4 {

    // DCL 指令重排volatile
    private static  volatile SingletonExample4 instance = null;


    private SingletonExample4(){

    }

    public static SingletonExample4 getInstance(){
        if(instance == null){
            synchronized (SingletonExample4.class) {
                if(instance == null){
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }


}
