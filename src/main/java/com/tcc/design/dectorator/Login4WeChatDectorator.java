package com.tcc.design.dectorator;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 5:55
 * 3 * @Descripiton:
 */
public class Login4WeChatDectorator implements IThirdLoginService{

    private ILoginService loginService;

    public Login4WeChatDectorator(ILoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public Member register(String userName, String password) {
        return loginService.register(userName,password);
    }

    @Override
    public Member register(String openId) {
        return loginService.register(openId,"123456");
    }

    @Override
    public boolean login(String username, String password) {
        return loginService.login(username,password);
    }

    @Override
    public boolean loginById(String openId) {
        return loginService.login(openId,"123456");
    }
}
