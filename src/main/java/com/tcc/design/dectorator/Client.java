package com.tcc.design.dectorator;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 6:19
 * 3 * @Descripiton:
 */
public class Client {

    public static void main(String[] args) {

        Login4WeChatDectorator login4WeChatDectorator = new Login4WeChatDectorator(new LoginService());
        Member m = login4WeChatDectorator.register("admin","123456");
        System.out.println(m);
        login4WeChatDectorator.login(m.getMemberName(),m.getPassword());

    }
}
