package com.tcc.design.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 3:01
 * 3 * @Descripiton:
 */
public class Leader implements IWork {

    private static Map<String,IWork> workers = new HashMap<>();

    static {
        workers.put("front_task",new UIWorker() );
        workers.put("db_work",new DbWorker());
        workers.put("admin_work",new JavaWorker());
    }

    @Override
    public void work() {

        // 老板下达一个任务，项目经理将任务拆分，分配工作给对应的具体执行者

        new JavaWorker().work();
        new UIWorker().work();
        new DbWorker().work();
    }
}
