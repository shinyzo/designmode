package com.tcc.design.strategy;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 9:24
 * 3 * @Descripiton:
 */
public class PayState<T> {

    private int code;

    private String msg;

    private T data;

    public PayState(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
