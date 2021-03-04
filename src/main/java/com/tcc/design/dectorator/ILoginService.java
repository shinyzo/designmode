package com.tcc.design.dectorator;

/**
 * @Author: zhangliangming
 * @Date: 2021/3/4 20:43.
 * Description:
 */
public interface ILoginService {

    Member register(String userName, String password);

    boolean login(String username,String password);
}