package com.tcc.design.filter.pipline;

/**
 * Author: liangming.zhang
 * Date : 2021/5/26 - 21:14
 * Description:
 */
public interface Handler {

    default  void receiveTask(HandlerContext context, Request request){
        context.fireTaskReceived(request);

    }


    default  void filterTask(HandlerContext context, Task task){
        context.fireTaskFiltered(task);
    }

    default  void executeTask(HandlerContext context,Task task){
        context.fireTaskExecuted(task);
    }

    default void exceptionCaught(HandlerContext context,Throwable e){
        throw new RuntimeException(e);
    }

    default void afterCompletion(HandlerContext context){
        context.fireAfterCompletion(context);
    }
}
