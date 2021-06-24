package com.tcc.design.observer.event;

import com.tcc.design.observer.Teacher;

/**
 * Author: liangming.zhang
 * Date : 2021/5/26 - 9:35
 * Description:
 */
public class Client {



    public static void main(String[] args) {
        Context context = new Context();
       TeacherEvent teacherEvent = new TeacherEvent();
       context.add(teacherEvent,new StudentListener());
       teacherEvent.dosomething();
       context.publish(teacherEvent);
    }
}
