package com.tcc.design.factory.abstr;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 4:34
 * 3 * @Descripiton:
 */
public class Main {

    public static void main(String[] args) {
        MilkFactory milkFactory= new MilkFactory();
        System.out.println(milkFactory.getMengniu().getMilk());
        System.out.println(milkFactory.getYili().getMilk());
    }
}
