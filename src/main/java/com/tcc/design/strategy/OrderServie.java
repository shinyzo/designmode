package com.tcc.design.strategy;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 9:29
 * 3 * @Descripiton:
 */
public interface OrderServie {

    PayState pay(Payment payment,Order order);

    PayState pay(Paymode paymode,Order order);

}
