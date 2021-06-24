package com.tcc.design.observer.event;

import com.tcc.design.observer.IObserver;
import net.sf.cglib.core.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: liangming.zhang
 * Date : 2021/5/26 - 9:23
 * Description:
 */
public class Context {

    private Map<Event, List<Listener>> map = new ConcurrentHashMap<>();

    public void add(Event e,Listener listener){
        if(map.get(e) == null || map.get(e).size()==0){
            List<Listener> observers = new ArrayList<>();
            observers.add(listener);
            map.put(e,observers);
        }else{
            map.get(e).add(listener);
        }
    }

    public void remove(Event e,Listener listener){
        if(map.get(e) != null && map.get(e).size() > 0){
            map.get(e).remove(listener);
        }
    }


    public void publish(Event e){
        if(map.get(e) != null && map.get(e).size() > 0){
            map.get(e).stream().forEach(listener -> {
                listener.onEvent(e);
            });
        }
    }



}
