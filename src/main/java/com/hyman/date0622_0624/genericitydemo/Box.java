package com.hyman.date0622_0624.genericitydemo;

/**
 * @program: javalearning
 * @Date: 2018/6/22 17:45
 * @Author: hyman.hu
 * @Description:
 */
public class Box<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
