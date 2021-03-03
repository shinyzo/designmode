package com.tcc.design.factory.simple;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 3:29
 * 3 * @Descripiton:
 */
public class CourseFactory {

    public static ICourse getCourseByName(String name){

        if(name.equals("java")){
            return new JavaCourse();
        }else if("python".equals(name)){
            return new PythonCourse();
        }
        return null;
    }


    public static ICourse getCourseByClass(Class<? extends ICourse> clazz)throws Exception{

       return clazz.newInstance();

    }

    public static ICourse getCourseByClass(String className)throws Exception{

        return (ICourse) Class.forName(className).newInstance();
    }
}
