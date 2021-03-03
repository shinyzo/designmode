package com.tcc.design.factory.abstr;

import com.tcc.design.factory.template.IMilk;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 4:12
 * 3 * @Descripiton:
 *    抽象工厂：客户端只需要调用不需要理解内部细节，并且只能使用配置好的接口
 *
 */
public abstract class AbstractFactory {

    abstract IMilk getYili();

    abstract IMilk getMengniu();

}
