package com.tcc.design.factory;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 14:50
 * Description:
 */
public class ProxyFactory {


    public static  <T> T getInstance(Class clazz){

        Class[] interfaces = clazz.getInterfaces();
        if(interfaces.length > 0){
           return  getInstanceByJdkProxy(clazz);
        }
        return getInstanceByCglib(clazz);
    }

    private static  <T> T getInstanceByJdkProxy(Class clazz){
        JdkProxy jdkProxy = new JdkProxy(clazz);
        return (T) jdkProxy.getInstance();
    }

    private static <T> T getInstanceByCglib(Class clazz){
        CglibProxy cglibProxy = new CglibProxy();
        return (T) cglibProxy.getProxy(clazz);
    }
}
