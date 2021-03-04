package com.tcc.design.delegate.mvc;


/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 4:55
 * 3 * @Descripiton:
 */
public class Client {

    public static void main(String[] args)throws Exception {

        Class clazz = HelloWorldController.class;

        Handler handler = Handler.builder().setController(clazz.newInstance()).setMethod(clazz.getMethod("index")).setUrl("/hello").build();
//
        HandlerRegister.addHandler(handler.getUrl(),handler);

        DispatchServlet dispatchServlet =  new DispatchServlet();
        dispatchServlet.doDispatch(new MyHttpServletRequest().setUri("/hello"),null);


    }
}
