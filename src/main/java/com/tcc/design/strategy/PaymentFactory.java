package com.tcc.design.strategy;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 9:40
 * 3 * @Descripiton:
 */
public class PaymentFactory {



    public static Payment getPayment(Paymode paymode){

        switch (paymode){
            case ALI_PAY:
                return new AliPay();
            case WECHAT_PAY:
                return new WeChatPay();
            case UNION_PAY:
                return new UnionPay();
            default:
                throw new RuntimeException("不存在的支付方式，请扩展！");

        }
    }

}
