package com.tcc.design.iterator;

import java.util.List;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 20:26
 * Description:
 */
public class DinerMenu implements Menu {

    List<MenuItem> menuItemList ;

    public DinerMenu(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItemList);
    }


}
