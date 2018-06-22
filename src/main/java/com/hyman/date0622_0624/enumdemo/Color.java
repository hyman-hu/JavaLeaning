package com.hyman.date0622_0624.enumdemo;

import javax.naming.Name;

/**
 * @program: javalearning
 * @Date: 2018/6/22 17:09
 * @Author: hyman.hu
 * @Description: 枚举
 */
public enum Color implements Behaviour {
//    RED, GREEN, BLANK, YELLOW
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);

    private String name;
    private int index;

    Color(String name, int index){
        this.name=name;
        this.index = index;
    }

    // 普通方法
    public static String getName(int index) {
        for (Color c : Color.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }

    @Override
    public void print() {
        System.out.println("name: "+this.name+", index: "+this.index);
    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
