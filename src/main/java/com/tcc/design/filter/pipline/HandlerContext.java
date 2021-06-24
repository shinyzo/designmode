package com.tcc.design.filter.pipline;

/**
 * Author: liangming.zhang
 * Date : 2021/5/26 - 21:14
 * Description:
 */
public class HandlerContext {

    private HandlerContext prev;

    private HandlerContext next;

    private Handler handler;

    public HandlerContext getPrev() {
        return prev;
    }

    public void setPrev(HandlerContext prev) {
        this.prev = prev;
    }

    public HandlerContext getNext() {
        return next;
    }

    public void setNext(HandlerContext next) {
        this.next = next;
    }

    public Handler handler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void fireTaskReceived(Request request){
        invokeTaskReceived(getNext(),request);
    }

    private void invokeTaskReceived(HandlerContext ctx, Request request) {
        if(ctx != null){
            try{
                ctx.handler().receiveTask(ctx,request);
            }catch (Throwable e) {
                ctx.handler().exceptionCaught(ctx,e);
            }
        }
    }

    public void fireTaskFiltered(Task task){
        invokeTaskFiltered(getNext(),task);
    }

    private void invokeTaskFiltered(HandlerContext ctx, Task task) {
        if(ctx != null){
            try{
                ctx.handler().filterTask(ctx,task);
            }catch (Throwable e) {
                ctx.handler().exceptionCaught(ctx,e);
            }
        }
    }

    public void fireTaskExecuted(Task task){
        invokeTaskExecuted(getNext(),task);
    }

    private void invokeTaskExecuted(HandlerContext ctx, Task task) {

        if(ctx != null){
            try{
                ctx.handler().executeTask(ctx,task);
            }catch (Throwable e) {
                ctx.handler().exceptionCaught(ctx,e);
            }
        }
    }



    public void fireAfterCompletion(HandlerContext ctx) {
        invokeAfterCompletion(getNext());
    }

    static void invokeAfterCompletion(HandlerContext ctx) {
        if (null != ctx) {
            ctx.handler().afterCompletion(ctx);
        }
    }
}
