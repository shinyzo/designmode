package com.tcc.design.iterator.compsite;

import com.tcc.design.iterator.Menu;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 21:36
 * Description:
 */
public abstract class MenuComponent {


    public void addComponent(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void removeComponent(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    public int getPrice(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}
