package com.tcc.design.template.file;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 14:49
 * Description:
 */
public class TextFileProcess extends AbstractFIle<Test> {

    @Override
    protected void after() {
        System.out.println("after");
    }

    @Override
    protected void processItem(Test test) {
        System.out.println(test.getAge());
        System.out.println(test.getName());
    }

    @Override
    protected void onException(Exception e) {
        e.printStackTrace();
    }

    @Override
    protected List<Test> before() {
        List<Test> tests = new ArrayList<>();
        return tests;
    }
}
