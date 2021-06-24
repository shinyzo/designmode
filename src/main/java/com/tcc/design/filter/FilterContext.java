package com.tcc.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: liangming.zhang
 * Date : 2021/5/26 - 20:56
 * Description:
 */
public class FilterContext {

    private List<Filter> filterList = new ArrayList<>();

    private Request request;

    public FilterContext(Request request) {
        this.request = request;
    }

    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    public void execute(){

        for(Filter filter:filterList){
            if(!filter.doFilter(request)){
                return;
            }
        }
        filterList.forEach(filter -> {
            if(!filter.doFilter(request)){
                return;
            }
        });
    }

    public static void main(String[] args) {
        FilterContext filterContext = new FilterContext(new Request());
        filterContext.addFilter(new OneRequestFilter());
        filterContext.addFilter(new SecondRequestFilter());
        filterContext.execute();
    }
}
