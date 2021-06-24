package com.tcc.design.filter.pipline;

/**
 * Author: liangming.zhang
 * Date : 2021/5/26 - 21:48
 * Description:
 */
public class TestHandler implements Handler {
    @Override
    public void receiveTask(HandlerContext context, Request request) {

        System.out.println("==> receive context");

    }
}
