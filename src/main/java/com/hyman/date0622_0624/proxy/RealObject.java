package com.hyman.date0622_0624.proxy;

/**
 * @program: javalearning
 * @Date: 2018/6/22 15:56
 * @Author: hyman.hu
 * @Description:
 */
public class RealObject implements Interface {
    @Override
    public void getMyName() {
        System.out.println("my name is hyman");
    }

    @Override
    public String getNameById(String id) {
        System.out.println("argument id: " + id);
        return "hyman";
    }
}
