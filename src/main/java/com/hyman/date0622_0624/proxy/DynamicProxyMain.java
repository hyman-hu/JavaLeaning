package com.hyman.date0622_0624.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: javalearning
 * @Date: 2018/6/22 16:17
 * @Author: hyman.hu
 * @Description: 动态代理测试类
 */
public class DynamicProxyMain {
    public static void consumer(Interface iface) {
        iface.getMyName();
        String name = iface.getNameById("1");
        System.out.println("name: " + name);
    }

    public static void main(String[] args) throws Exception, SecurityException, Throwable {
        RealObject realObject = new RealObject();
        consumer(realObject);
        System.out.println("==============================");

        // 动态代理
        ClassLoader classLoader = Interface.class.getClassLoader();
        Class<?>[] interfaces = new Class[] { Interface.class };
        InvocationHandler handler = new DynamicProxyHandler(realObject);
        Interface proxy = (Interface) Proxy.newProxyInstance(classLoader, interfaces, handler);

        System.out.println("in dynamicproxyMain proxy: " + proxy.getClass());
        consumer(proxy);
    }
}
