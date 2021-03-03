package com.tcc.design.factory.abstr2;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 5:02
 * 3 * @Descripiton:
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写python笔记");
    }
}
