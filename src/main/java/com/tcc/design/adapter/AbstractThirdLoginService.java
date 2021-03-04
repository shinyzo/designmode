package com.tcc.design.adapter;

import java.util.UUID;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 5:58
 * 3 * @Descripiton:
 */
public abstract class AbstractThirdLoginService extends LoginService implements IThirdLoginService {


    public static final String DEFAULT_PASSWORD = "123456";


    @Override
    public Member register(String openId) {

        return super.register(openId, UUID.randomUUID().toString());
    }


    @Override
    public boolean login(Member member) {
        return super.login(member.getMemberName(),member.getPassword());
    }


    @Override
    public Member register(String phone, String code) {
        return null;
    }
}
