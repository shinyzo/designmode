package com.tcc.design.delegate;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 3:03
 * 3 * @Descripiton:
 */
public class DbWorker implements IWork {

    @Override
    public void work() {
        System.out.println("我是db,我做数据库脚本工作");
    }
}
