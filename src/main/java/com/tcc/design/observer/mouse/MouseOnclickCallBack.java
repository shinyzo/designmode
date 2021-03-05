package com.tcc.design.observer.mouse;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/5 0005 上午 9:19
 * 3 * @Descripiton:
 */
public class MouseOnclickCallBack implements ICallBack {

    @Override
    public void callBack() {
        System.out.println("鼠标悬停事件回调");
    }



}
