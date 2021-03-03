package com.tcc.design.singleton;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 9:23
 * 3 * @Descripiton:
 */
public class Main {


    public static void main(String[] args)throws Exception {

        ExecutorService executorService = Executors.newCachedThreadPool();

        final CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            final int count = i;
            executorService.execute(() -> {
                try {

                    // 反射破坏单例
//                    Class clazz = SingletonExample6.class;
//                    Constructor c = clazz.getDeclaredConstructor();
//                    c.setAccessible(true);
//                    SingletonExample6 instance = (SingletonExample6)c.newInstance();
//
//                    //正常的获取实例方式
//                    SingletonExample6 staticInnerClass = SingletonExample6.getInstanace();
//                    System.out.println(instance);

                    SingletonExample9.getInstance();

                } catch (Exception e) {
                   e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();




    }


}
