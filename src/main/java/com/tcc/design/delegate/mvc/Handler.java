package com.tcc.design.delegate.mvc;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 4:10
 * 3 * @Descripiton:
 */
public class Handler {

    private Object controller;

    private Method method;

    private String url;

    public Object getController() {
        return controller;
    }

    public void setController(Object controller) {
        this.controller = controller;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public static Handler.HandlerBuilder builder() {
        return new Handler.HandlerBuilder();
    }

    public static class HandlerBuilder{

        private Object controller;

        private Method method;

        private String url;

        public Handler.HandlerBuilder setController(Object controller) {
            this.controller = controller;
            return this;
        }


        public Handler.HandlerBuilder setMethod(Method method) {
            this.method = method;
            return this;
        }



        public Handler.HandlerBuilder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Handler build(){
           Handler handler =  new Handler();
           handler.setController(this.controller);
           handler.setMethod(this.method);
           handler.setUrl(this.url);
           return handler;
        }

    }

    @Override
    public String toString() {
        return "Handler{" +
                "controller=" + controller +
                ", method=" + method +
                ", url='" + url + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Handler handler = Handler.builder().setController(new HelloWorldController() ).setMethod(null).setUrl("/hello").build();
        System.out.println(handler.toString());
    }

}
