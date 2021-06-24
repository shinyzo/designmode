package com.tcc.design.template.file;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 14:50
 * Description:
 */
public class Test implements Comparable {
    private String name;

    private int age;

    public Test(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Test t = (Test) o;
        return this.getAge() >= t.getAge() ? 1:-1;
    }
}
