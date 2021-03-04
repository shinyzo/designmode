package com.tcc.design.delegate.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 3:23
 * 3 * @Descripiton:
 */
public class DispatchServlet {



    public void doDispatch(MyHttpServletRequest request, HttpServletResponse response) throws Exception{

        Handler h = HandlerRegister.getHandler(request.getUri());
        if(h != null){
            Method m = h.getMethod();

            Object result = m.invoke(h.getController(),null);
            System.out.println(result);
        }

    }

}
