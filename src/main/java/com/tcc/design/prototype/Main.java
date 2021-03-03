package com.tcc.design.prototype;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 11:04
 * 3 * @Descripiton:
 */
public class Main {

    public static void main(String[] args)throws Exception {

        User user = new User();
        user.setName("张三");
        user.setAge(18);
        School school = new School();
        school.setSchoolName("BBBBB");
        user.setSchool(school);

        User u2 = (User)user.clone();

        System.out.println(u2==user);
        System.out.println(u2.getName().equals(user.getName()));

        System.out.println(u2.getSchool()== user.getSchool());
        System.out.println(u2.getSchool().getSchoolName());
        u2.getSchool().setSchoolName("AAAAA");
        System.out.println(u2.getSchool().getSchoolName());
        System.out.println(user.getSchool().getSchoolName());

    }
}
