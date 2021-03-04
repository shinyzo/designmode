package com.tcc.design.delegate;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 3:02
 * 3 * @Descripiton:
 */
public class JavaWorker implements IWork {
    @Override
    public void work() {
        System.out.println("我是javaer,我做后台开发工作");
    }
}
