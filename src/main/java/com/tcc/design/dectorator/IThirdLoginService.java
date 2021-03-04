package com.tcc.design.dectorator;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 5:56
 * 3 * @Descripiton:
 */
public interface IThirdLoginService extends ILoginService{


    Member register(String openId);

    boolean loginById(String openId);


}
