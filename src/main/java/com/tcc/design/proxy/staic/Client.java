package com.tcc.design.proxy.staic;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 3:00
 * 3 * @Descripiton:
 */
public class Client {

    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        SubjectProxy proxy = new SubjectProxy(subject);
        proxy.request();
    }
}
