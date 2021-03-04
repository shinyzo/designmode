package com.tcc.design.adapter;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 5:56
 * 3 * @Descripiton:
 */
public interface IThirdLoginService {


    Member register(String openId);

    Member register(String phone,String code);

    boolean login(Member member);



}
