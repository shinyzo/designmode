package com.tcc.design.factory.abstr2;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 5:00
 * 3 * @Descripiton:
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写java笔记");
    }
}
