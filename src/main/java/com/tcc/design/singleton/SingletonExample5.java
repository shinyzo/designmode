package com.tcc.design.singleton;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 9:00
 * 3 * @Descripiton:
 *  内部类模式 线程安全
 */
@ThreadSafe
@Recommend
public class SingletonExample5 {

    private static SingletonExample5 instance = null;


    private SingletonExample5(){

    }

    public  static SingletonExample5 getInstance(){
       return  LazyHolder.INSTANCE;
    }


    public static class LazyHolder{
        public static final SingletonExample5 INSTANCE = new SingletonExample5();
    }


}
