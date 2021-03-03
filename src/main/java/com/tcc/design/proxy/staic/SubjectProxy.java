package com.tcc.design.proxy.staic;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 2:58
 * 3 * @Descripiton:
 */
public class SubjectProxy implements ISubject {

    private ISubject subject;

    public SubjectProxy(ISubject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before(){
        System.out.println("before");

    }

    private void after(){
        System.out.println("after");

    }
}
