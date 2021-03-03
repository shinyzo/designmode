package com.tcc.design.factory.abstr2;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 4:59
 * 3 * @Descripiton:
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制java课程");
    }
}
