package com.tcc.design.factory.abstr2;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 5:01
 * 3 * @Descripiton:
 */
public class PythonVideo implements IVideo {

    @Override
    public void record() {
        System.out.println("录制python视频");
    }
}
