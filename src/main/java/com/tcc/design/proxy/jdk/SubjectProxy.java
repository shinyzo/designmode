package com.tcc.design.proxy.jdk;

import com.tcc.design.proxy.staic.ISubject;

import java.lang.reflect.Proxy;

/**
 * Author: liangming.zhang
 * Date : 2021/6/24 - 17:10
 * Description:
 */
public class SubjectProxy {

    public static <T> T getInstance(T subject){
        return (T) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),new JdkProxyHandler(subject));
    }
}
