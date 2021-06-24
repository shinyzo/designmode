package com.tcc.design.factory;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 13:46
 * Description:
 */
public class CacheProxy<T extends ICacheAdapter> extends JdkProxy<T> {

    public CacheProxy(Class<T> entity) {
        super(entity);
    }
}
