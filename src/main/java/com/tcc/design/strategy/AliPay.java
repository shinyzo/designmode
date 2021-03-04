package com.tcc.design.strategy;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 9:25
 * 3 * @Descripiton:
 */
public class AliPay implements Payment {

    @Override
    public PayState pay(Order order) {
        System.out.println("orderId:"+order.getOrderId()+",orderAmount:"+order.getAmount());
        System.out.println("检测用户账户余额");
        System.out.println("支付宝扣款");
        System.out.println("支付成功");
        return new PayState(200,"支付成功",order);
    }
}
