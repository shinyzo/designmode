package com.tcc.design.strategy;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 9:23
 * 3 * @Descripiton:
 */
public interface Payment {


    PayState pay(Order order);

}
