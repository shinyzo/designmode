package com.tcc.design.proxy.cglib;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 4:15
 * 3 * @Descripiton:
 */
public class Client {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        JavaJob job = (JavaJob) cglibProxy.getProxy(JavaJob.class);
        System.out.println(job.getClass());
        job.findJob();
    }
}
