package com.tcc.design.adapter;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 5:55
 * 3 * @Descripiton:
 */
public class Login4TelAdapter extends AbstractThirdLoginService{



    @Override
    public Member register(String phone, String code) {

        if(checkCode(code)){
            return super.register(phone);
        }else{
            throw new RuntimeException("验证码不正确");
        }
    }


    private boolean checkCode(String code){
        if("123456".equals(code)){
            return true;
        }
        return false;
    }
}
