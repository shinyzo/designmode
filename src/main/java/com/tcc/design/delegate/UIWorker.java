package com.tcc.design.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 3:02
 * 3 * @Descripiton:
 */
public class UIWorker implements IWork {



    @Override
    public void work() {
        System.out.println("我是ui,我做前端页面工作");
    }
}
