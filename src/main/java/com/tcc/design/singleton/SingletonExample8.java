package com.tcc.design.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 9:33
 * 3 * @Descripiton:
 */
@ThreadSafe
public class SingletonExample8 {

    private static final Map<String,Object> registerMap = new ConcurrentHashMap<String,Object>();

    private SingletonExample8() {
    }

    public static SingletonExample8 getInstance(String name){
        if(name == null){
            name = SingletonExample8.class.getSimpleName();
        }
        if(registerMap.get(name) == null){
            registerMap.put(name,new SingletonExample8());
        }

        return (SingletonExample8) registerMap.get(name);
    }
}
