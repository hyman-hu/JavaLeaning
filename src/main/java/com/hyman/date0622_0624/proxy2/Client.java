package com.hyman.date0622_0624.proxy2;

/**
 * @program: javalearning
 * @Date: 2018/6/22 16:52
 * @Author: hyman.hu
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        Subject proxy = DynProxyFactory.getInstance();
        proxy.dealTask("DBQueryTask");
    }
}
