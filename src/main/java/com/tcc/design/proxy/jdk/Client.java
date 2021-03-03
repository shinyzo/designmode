package com.tcc.design.proxy.jdk;

import com.tcc.design.proxy.staic.ISubject;
import com.tcc.design.proxy.staic.RealSubject;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 3:12
 * 3 * @Descripiton:
 * // 反射
 */
public class Client {

    public static void main(String[] args)throws Exception{

//        JdkProxyHandler jdkProxyHandler = new JdkProxyHandler();
//        ISubject proxy = jdkProxyHandler.getInstance(new RealSubject());
//        proxy.request();

        F58Proxy f58Proxy = new F58Proxy();
        IHouse houseProxy = f58Proxy.getHouseProxy(new HaijingHouse()); // 代理对象
        System.out.println(houseProxy.getClass());
        houseProxy.findHouse();


        // 从内存获取代理类
        byte[] bytes =  ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{IHouse.class});
        FileOutputStream fileOutputStream = new FileOutputStream("$Proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();

    }

}
