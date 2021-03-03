package com.tcc.design.proxy.cglib;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 3:45
 * 3 * @Descripiton:
 */
public class JavaJob implements IJob  {


    @Override
    public void findJob() {
        System.out.println("find java object ,month money 25k");
    }
}
