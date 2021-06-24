package com.tcc.design.iterator.compsite;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 21:47
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        MenuComponent allmenus = new Menu("ALL_Menus","");
        MenuComponent menuComponent = new Menu("Diner_Menu","dinner menu");
        MenuComponent menuComponent1 = new Menu("Lunch_Menu","lunch menu");
        allmenus.addComponent(menuComponent);
        allmenus.addComponent(menuComponent1);
        MenuItem menuItem = new MenuItem("tangchupaigu","",19);
        MenuItem menuItem1 = new MenuItem("qingzhegnyu","",78);

        MenuComponent tiandian = new Menu("Tian_dian","tian dian");
        MenuItem menuItem2 = new MenuItem("apple pie","",78);

        menuComponent.addComponent(menuItem);
        menuComponent.addComponent(menuItem1);
        menuComponent1.addComponent(tiandian);
        tiandian.addComponent(menuItem2);
        allmenus.print();



    }
}
