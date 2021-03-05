package com.tcc.design.observer.mouse;

import java.lang.reflect.Method;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/5 0005 上午 10:30
 * 3 * @Descripiton:
 */
public class Event {

    private Object source;

    private Method m1;

    private Object target;

    private Method m2;

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Method getM1() {
        return m1;
    }

    public void setM1(Method m1) {
        this.m1 = m1;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getM2() {
        return m2;
    }

    public void setM2(Method m2) {
        this.m2 = m2;
    }
}
