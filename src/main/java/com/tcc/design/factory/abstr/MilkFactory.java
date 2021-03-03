package com.tcc.design.factory.abstr;

import com.tcc.design.factory.template.IMilk;
import com.tcc.design.factory.template.MengniuMilkFactory;
import com.tcc.design.factory.template.YiliMilkFactory;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/2 0002 下午 4:32
 * 3 * @Descripiton:
 */
public class MilkFactory extends AbstractFactory {

    @Override
    IMilk getYili() {
        return new YiliMilkFactory().create();
    }

    @Override
    IMilk getMengniu() {
        return new MengniuMilkFactory().create();
    }
}
