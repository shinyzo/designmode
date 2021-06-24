package com.tcc.design.factory.product;

/**
 * Author: liangming.zhang
 * Date : 2021/6/22 - 14:25
 * Description:
 */
public class ConcreteCreator extends Creator {

    @Override
    Product createProduct() {
        return new MilkProduct();
    }
}
