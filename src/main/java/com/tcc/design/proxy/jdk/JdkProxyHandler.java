package com.tcc.design.proxy.jdk;

import com.sun.org.apache.bcel.internal.generic.ISUB;
import com.tcc.design.proxy.staic.ISubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 3:08
 * 3 * @Descripiton:
 */
public class JdkProxyHandler implements InvocationHandler {

    private ISubject target;

    public ISubject getInstance(ISubject subject){
        this.target = subject;
        Class clazz = target.getClass();
        return (ISubject) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // 执行被代理类等方法
       Object obj =  method.invoke(this.target,args);

       after();
       return obj;
    }

    public void before(){
        System.out.println("before");
    }

    public void after(){
        System.out.println("after");
    }
}
