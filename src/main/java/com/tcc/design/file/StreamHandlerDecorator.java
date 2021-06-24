package com.tcc.design.file;


import java.io.InputStream;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 11:16
 * Description:
 */
public class StreamHandlerDecorator extends AbstractStreamHandler {


    private AbstractStreamHandler abstractStreamHandler;

    public StreamHandlerDecorator(AbstractStreamHandler abstractStreamHandler) {
        this.abstractStreamHandler = abstractStreamHandler;
    }

    @Override
    protected void handlerText(InputStream is) {
        preHandler();
        abstractStreamHandler.handlerText(is);
        postHandler();
    }

    @Override
    protected void handlerExcel(InputStream is) {
        preHandler();
        abstractStreamHandler.handlerExcel(is);
        postHandler();
    }

    private void preHandler() {
        System.out.println("==> preHandler");
    }

    private void postHandler() {
        System.out.println("==> postHandler");
    }


}
