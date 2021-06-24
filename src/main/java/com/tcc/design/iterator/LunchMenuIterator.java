package com.tcc.design.iterator;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 20:39
 * Description:
 */
public class LunchMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position =0;

    public LunchMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position<menuItems.length) return true;
        return false;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
