package com.tcc.design.factory.template;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 3:54
 * 3 * @Descripiton:
 */
public class MengniuMilkFactory implements IFactory {
    @Override
    public IMilk create() {
        return new MengniuMilk();
    }
}
