package com.tcc.design.observer.mouse;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/5 0005 上午 9:23
 * 3 * @Descripiton: 给某个对象的方法动态添加监听事件
 *   可以考虑用代理模式，拿到对方的引用，在触发方法之后，调用监听的对象
 *
 */
public class EvenetListener {

    Map<MouseEventType,Event> eventMap = new HashMap<>();

    public void addListener(MouseEventType mouseEvent,Event event)throws Exception{
        eventMap.put(mouseEvent,event);
    }


    /**
     * 触发
     * @param mouseEvent
     * @throws Exception
     */
    public void trigger(MouseEventType mouseEvent)throws Exception{
        if(!eventMap.containsKey(mouseEvent)) return;
        Event event = eventMap.get(mouseEvent);
        event.getM2().invoke(event.getTarget());
    }

}
