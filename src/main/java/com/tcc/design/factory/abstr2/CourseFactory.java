package com.tcc.design.factory.abstr2;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 4:58
 * 3 * @Descripiton:
 */
public abstract class CourseFactory {

    abstract IVideo createVideo();

    abstract INote createNote();
}
