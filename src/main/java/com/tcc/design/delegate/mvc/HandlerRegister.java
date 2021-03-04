package com.tcc.design.delegate.mvc;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 4:11
 * 3 * @Descripiton:
 */
public class HandlerRegister {

    private static Map<String,Handler> handlerMap = new HashMap<>();

    public static void addHandler(String url,Handler handler){
        handlerMap.put(url,handler);
    }

    public static void removeUrl(String url){

        handlerMap.remove(url);
    }

    public static Handler getHandler(String url){
        return handlerMap.get(url);
    }
}
