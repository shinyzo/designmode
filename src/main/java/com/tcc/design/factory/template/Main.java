package com.tcc.design.factory.template;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 3:55
 * 3 * @Descripiton:
 */
public class Main {

    public static void main(String[] args) {

        IFactory yiliMilkFactory = new YiliMilkFactory();
        IMilk yili = yiliMilkFactory.create();
        System.out.println(yili.getMilk());

        IFactory mengniuMilkFactory = new MengniuMilkFactory();
        IMilk mengniu = mengniuMilkFactory.create();
        System.out.println(   mengniu.getMilk());

    }
}
