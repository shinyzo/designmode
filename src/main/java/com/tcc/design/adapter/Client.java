package com.tcc.design.adapter;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 6:19
 * 3 * @Descripiton:
 */
public class Client {

    public static void main(String[] args) {

        LoginService loginService = new LoginService();
        Member m = loginService.register("admin","111111");
        System.out.println(m.toString());
        System.out.println(loginService.login(m.getMemberName(),m.getPassword()));


        Login4TelAdapter login4TelAdapter = new Login4TelAdapter();
        Member m1 = login4TelAdapter.register("138122222222","123456");
        System.out.println(m1.toString());
        System.out.println(login4TelAdapter.login(m1));

        Login4SinaAdapter login4SinaAdapter = new Login4SinaAdapter();
        Member m2 = login4SinaAdapter.register("21321321321");
        System.out.println(m2);
        login4SinaAdapter.login(m2);

    }
}
