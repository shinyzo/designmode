package com.tcc.design.strategy;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 9:35
 * 3 * @Descripiton:
 */
public enum Paymode {

    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WeChatPay()),
    UNION_PAY(new UnionPay());

    private Payment payment;

    Paymode(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment(){
        return this.payment;
    }
}
