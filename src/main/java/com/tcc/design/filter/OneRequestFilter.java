package com.tcc.design.filter;

/**
 * Author: liangming.zhang
 * Date : 2021/5/26 - 20:55
 * Description:
 */
public class OneRequestFilter implements Filter {
    @Override
    public boolean doFilter(Request request) {

        System.out.println("filter first");
        return false;
    }
}
