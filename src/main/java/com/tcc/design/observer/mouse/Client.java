package com.tcc.design.observer.mouse;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/5 0005 上午 9:17
 * 3 * @Descripiton:
 */
public class Client {

    public static void main(String[] args)throws Exception {


        //第一种方式  缺点 高耦合，必须要有回调函数 类似于javascript的事件注册
        Mouse mouse = new Mouse();
        mouse.click(new ICallBack() {
            @Override
            public void callBack() throws Exception {
                System.out.println("鼠标单击回调函数");
            }
        });


        // 第二种方式 采用注解+反射，进行回调解耦，但是需要手动将方法进行代理，然后隐式调用
        // 比较复杂，高级进阶

        Class clazz = Mouse.class;
        Method method = clazz.getMethod("dbClick",String.class);
        method.invoke(clazz.newInstance(),"1234");
        CallBack callBack = method.getAnnotation(CallBack.class);
        Method call = clazz.getDeclaredMethod(callBack.callback());
        call.invoke(clazz.newInstance(),call.getParameterTypes());

        // 第三种  注册登记式  需要手动注册
        Mouse mouse1 = new Mouse();
        Class clazz1 = MouseEvent.class;
        Event evenet = new Event();
        evenet.setTarget(clazz1.newInstance());
        evenet.setM2(clazz1.getMethod("upEvenet"));
        mouse1.addListener(MouseEventType.ON_UP,evenet);
        mouse1.up();


        // 链条式
        mouse1.mouseOver().addCallBack(new MouseOnclickCallBack());




    }
}
