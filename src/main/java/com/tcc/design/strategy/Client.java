package com.tcc.design.strategy;

import java.math.BigDecimal;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 9:31
 * 3 * @Descripiton:
 */
public class Client {

    public static void main(String[] args) {

        // 一般写法，根据前端传过来的值进行判断new 支付方式
        Order order = new Order("2021030409311200000001",11L,new BigDecimal(1200.90));
        Payment payment = new AliPay();

        OrderServie orderServie = new OrderServiceImpl();
        System.out.println( orderServie.pay(payment,order).toString());


        // 策略模式,支付方式只能用户选择
        System.out.println(orderServie.pay(Paymode.UNION_PAY,order).toString());

        // 简单工厂也可以
        System.out.println(orderServie.pay(PaymentFactory.getPayment(Paymode.WECHAT_PAY),order));
    }
}
