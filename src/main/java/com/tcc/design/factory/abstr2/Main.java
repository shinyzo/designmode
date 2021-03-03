package com.tcc.design.factory.abstr2;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 5:03
 * 3 * @Descripiton:
 */
public class Main {

    public static void main(String[] args) {
            CourseFactory courseFactory = new JavaCourseFactory();
            IVideo video = courseFactory.createVideo();
            INote note = courseFactory.createNote();
            video.record();
            note.edit();

            courseFactory = new PythonCourseFactory();
            IVideo video1 = courseFactory.createVideo();
            INote note1 = courseFactory.createNote();
            video1.record();
            note1.edit();
    }
}
