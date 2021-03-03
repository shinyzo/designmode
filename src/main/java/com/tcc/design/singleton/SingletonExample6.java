package com.tcc.design.singleton;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 9:15
 * 3 * @Descripiton:
 *
 *   反射和反序列化问题
 */
@ThreadSafe
@Recommend
public class SingletonExample6 {




    private SingletonExample6(){

    }


    static enum Singleton{
        INSTANCE;
        private SingletonExample6 singletonExample6;
        private Singleton(){
            singletonExample6 = new SingletonExample6();
        }

        public SingletonExample6 getInstance(){
            return singletonExample6;
        }
    }

    public static SingletonExample6 getInstanace(){
        return Singleton.INSTANCE.getInstance();
    }

}
