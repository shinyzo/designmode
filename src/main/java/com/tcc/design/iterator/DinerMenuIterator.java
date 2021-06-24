package com.tcc.design.iterator;

import java.util.List;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 20:29
 * Description:
 */
public class DinerMenuIterator implements Iterator {

    List<MenuItem> menuItemList;

    int position = 0;

    public DinerMenuIterator(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    @Override
    public boolean hasNext() {
        if(position < menuItemList.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        MenuItem menuItem =  menuItemList.get(position);
        position++;
        return menuItem;
    }
}
