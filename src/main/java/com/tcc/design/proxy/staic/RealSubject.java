package com.tcc.design.proxy.staic;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 2:57
 * 3 * @Descripiton:
 */
public class RealSubject implements ISubject {

    @Override
    public void request() {
        System.out.println("request ...");
    }
}
