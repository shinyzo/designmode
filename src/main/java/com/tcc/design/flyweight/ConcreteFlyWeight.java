package com.tcc.design.flyweight;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/8 0008 上午 9:15
 * 3 * @Descripiton:
 */
public class ConcreteFlyWeight implements IFlyWeight {
    @Override
    public void operator() {
        System.out.println("-----------------");
    }
}
