package com.tcc.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 3:37
 * 3 * @Descripiton:
 */
public class F58Proxy implements InvocationHandler {


    private IHouse houseTarget;

    public IHouse getHouseProxy(IHouse house){
        this.houseTarget =house;
        return (IHouse) Proxy.newProxyInstance(house.getClass().getClassLoader(),house.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("before");
        if(houseTarget!=null){
            result = method.invoke(houseTarget,args);
        }
        System.out.println("after");
        return result;
    }




}
