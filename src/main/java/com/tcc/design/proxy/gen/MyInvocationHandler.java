package com.tcc.design.proxy.gen;

import java.lang.reflect.Method;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 5:36
 * 3 * @Descripiton:
 */
public interface MyInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
