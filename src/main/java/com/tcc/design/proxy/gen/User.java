package com.tcc.design.proxy.gen;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 5:40
 * 3 * @Descripiton:
 */
public class User implements IUser {

    @Override
    public void findLove(){
        System.out.println("find loving..");
    }
}
