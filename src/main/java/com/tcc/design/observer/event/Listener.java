package com.tcc.design.observer.event;

/**
 * @Author: zhangliangming
 * @Date: 2021/3/4 21:06.
 * Description:
 *  观察者统一接口
 */
public interface Listener {


    public void onEvent(Event e);

}