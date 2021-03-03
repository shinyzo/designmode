package com.tcc.design.factory.abstr2;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 5:04
 * 3 * @Descripiton:
 */
public class PythonCourseFactory extends CourseFactory {
    @Override
    IVideo createVideo() {
        return new PythonVideo();
    }

    @Override
    INote createNote() {
        return new PythonNote();
    }
}
