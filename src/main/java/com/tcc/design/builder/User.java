package com.tcc.design.builder;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 15:18
 * Description:
 */
public class User {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }


    public static void main(String[] args) {
        User user = new User().setUserName("dddd").setPassword("123232");
        System.out.println(user.getPassword());
    }
}
