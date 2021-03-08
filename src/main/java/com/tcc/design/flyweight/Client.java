package com.tcc.design.flyweight;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/8 0008 上午 9:16
 * 3 * @Descripiton:
 */
public class Client {

    public static void main(String[] args) {

        IFlyWeight flyWeight = FlyWeightFactory.getFlyWeight("aa");
        flyWeight.operator();

        IFlyWeight flyWeight1 = FlyWeightFactory.getFlyWeight("bb");
        flyWeight1.operator();


    }
}
