package com.tcc.design.factory;

import com.tcc.design.factory.simple.ICourse;
import com.tcc.design.factory.simple.JavaCourse;
import com.tcc.design.factory.simple.PythonCourse;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 13:10
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        CacheProxy<ICacheAdapter> jdkProxy = new CacheProxy(MemoryCacheAdapter.class);
        ICacheAdapter cacheAdapter =  jdkProxy.getInstance();
        cacheAdapter.set("111","1111");


        JdkProxy<ICourse> proxy = new JdkProxy(JavaCourse.class);
        ICourse course =  proxy.getInstance();
        course.leaning();


        Test test = ProxyFactory.getInstance(Test.class);
        test.test();

        ICourse c = ProxyFactory.getInstance(PythonCourse.class);
        c.leaning();
    }
}
