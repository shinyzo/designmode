package com.tcc.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 20:45
 * Description:
 */
public class Client {


    public static void main(String[] args) {
        List<MenuItem> menuItemList = new ArrayList<>();
        MenuItem menuItem = new MenuItem("sanmingzhi",12,"");
        MenuItem menuItem1 = new MenuItem("hanbaobao",16,"");
        menuItemList.add(menuItem);
        menuItemList.add(menuItem1);

        MenuItem[] menuItems = new MenuItem[2];
        menuItems[0] = menuItem1;
        menuItems[1] = menuItem;

        Menu menu = new DinerMenu(menuItemList);
        Menu menu1 = new LunchMenu(menuItems);
        Waitress waitress = new Waitress(menu,menu1);
        waitress.printMenu();


    }
}
