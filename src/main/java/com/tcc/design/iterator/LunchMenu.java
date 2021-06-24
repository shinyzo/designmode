package com.tcc.design.iterator;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 20:34
 * Description:
 */
public class LunchMenu implements Menu {

    MenuItem[] menuItems ;

    public LunchMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new LunchMenuIterator(menuItems);
    }
}
