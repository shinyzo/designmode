package com.tcc.design.strategy;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 9:30
 * 3 * @Descripiton:
 */
public class OrderServiceImpl implements OrderServie {

    @Override
    public PayState pay(Payment payment, Order order) {
        return payment.pay(order);
    }

    @Override
    public PayState pay(Paymode paymode, Order order) {
        return paymode.getPayment().pay(order);
    }
}
