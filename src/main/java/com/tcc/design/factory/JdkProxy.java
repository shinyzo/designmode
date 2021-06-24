package com.tcc.design.factory;

import com.tcc.design.proxy.staic.ISubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 13:06
 * Description:
 */
public class JdkProxy<T> implements InvocationHandler {

    private T target;

    public JdkProxy(Class<T> entity) {
        try {
            this.target = entity.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public T getInstance(){
        Class clazz = target.getClass();
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
}
