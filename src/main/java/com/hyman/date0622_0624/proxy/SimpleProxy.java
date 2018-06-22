package com.hyman.date0622_0624.proxy;

/**
 * @program: javalearning
 * @Date: 2018/6/22 15:57
 * @Author: hyman.hu
 * @Description:
 */
public class SimpleProxy implements Interface {

    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    @Override
    public void getMyName() {
        System.out.println("proxy getmyname");
        proxied.getMyName();
    }

    @Override
    public String getNameById(String id) {
        System.out.println("proxy getnamebyid");
        return proxied.getNameById(id);
    }
}
