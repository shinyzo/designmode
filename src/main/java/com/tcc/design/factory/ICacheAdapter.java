package com.tcc.design.factory;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 12:58
 * Description:
 */
public interface ICacheAdapter<T> {

    void set(String key,T value);

    T get(String key);

    void delete(String key);

    void expire(String key,T value,Long seconds);

}
