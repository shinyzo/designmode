package com.tcc.design.factory.abstr2;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 5:00
 * 3 * @Descripiton:
 */
public class JavaCourseFactory extends CourseFactory {

    @Override
    IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    INote createNote() {
        return new JavaNote();
    }
}


