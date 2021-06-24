package com.tcc.design.iterator.compsite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 21:43
 * Description:
 */
public class Menu extends MenuComponent {

    List<MenuComponent> menuComponentList = new ArrayList<>();

    private String name;

    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void addComponent(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void removeComponent(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        System.out.println( toString());
       Iterator iterator =  menuComponentList.iterator();
       while (iterator.hasNext()){
           MenuComponent menuComponent =(MenuComponent) iterator.next();
           menuComponent.print();
       }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
