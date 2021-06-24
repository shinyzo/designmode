package com.tcc.design.factory;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 13:00
 * Description:
 */
public class MemoryCacheAdapter<T> implements ICacheAdapter<T> {

    @Override
    public void set(String key, T value) {
        System.out.println(key+"-"+value);
    }

    @Override
    public T get(String key) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void expire(String key, T value, Long seconds) {

    }
}
