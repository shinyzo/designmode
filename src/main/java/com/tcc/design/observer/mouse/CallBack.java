package com.tcc.design.observer.mouse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/5 0005 上午 9:30
 * 3 * @Descripiton:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface CallBack {

    public String callback();

}
