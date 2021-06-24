package com.tcc.design.iterator.compsite;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 21:41
 * Description:
 */
public class MenuItem extends MenuComponent {

    private String name;

    private String description;

    private int price;

    public MenuItem(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
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
    public int getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println( toString());
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
