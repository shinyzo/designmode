package com.tcc.design.factory.simple;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 3:31
 * 3 * @Descripiton: 简单工厂的三种模式
 */
public class Main  {

    public static void main(String[] args)throws Exception {
        ICourse course = CourseFactory.getCourseByName("java");
        course.leaning();

        ICourse course1 = CourseFactory.getCourseByClass(PythonCourse.class);
        course1.leaning();

        ICourse course2 = CourseFactory.getCourseByClass("com.tcc.design.factory.simple.PythonCourse");
        course2.leaning();
    }
}
