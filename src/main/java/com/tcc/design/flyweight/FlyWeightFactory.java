package com.tcc.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/8 0008 上午 9:12
 * 3 * @Descripiton:
 */
public class FlyWeightFactory {

    private static Map<String ,IFlyWeight> pool = new HashMap<>();

    public static IFlyWeight getFlyWeight(String instanceName){
        if(pool.containsKey(instanceName)){
            return new ConcreteFlyWeight();
        }else{
            IFlyWeight flyWeight = new ConcreteFlyWeight();
            pool.put(instanceName,flyWeight);
            return flyWeight;
        }
    }
}
