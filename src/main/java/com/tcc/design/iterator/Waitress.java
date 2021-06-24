package com.tcc.design.iterator;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 20:42
 * Description:
 */
public class Waitress {

    Menu lunchMenu;
    Menu dinerMenu;

    public Waitress(Menu lunchMenu, Menu dinerMenu) {
        this.lunchMenu = lunchMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator iterator = this.lunchMenu.createIterator();
        Iterator iterator1 = this.dinerMenu.createIterator();
        iterator(iterator);
        iterator(iterator1);
    }

    public void iterator(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName()+","+menuItem.getPrice());
        }
    }
}
