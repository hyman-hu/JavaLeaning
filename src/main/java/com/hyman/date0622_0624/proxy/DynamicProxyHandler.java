package com.hyman.date0622_0624.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @program: javalearning
 * @Date: 2018/6/22 16:00
 * @Author: hyman.hu
 * @Description: 动态代理
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;//要代理的对象

    public DynamicProxyHandler(Object proxied) {//初始化  给代理对象赋值
        System.out.println("dynamic proxy handler constuctor: " + proxied.getClass());
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamic proxy name: " + proxy.getClass());
        System.out.println("method: " + method.getName());
        System.out.println("args: " + Arrays.toString(args));
        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object invokeObject = method.invoke(proxied, args);
        if (invokeObject != null) {
            System.out.println("invoke object: " + invokeObject.getClass());
        } else {
            System.out.println("invoke object is null");
        }
        return invokeObject;
    }
}
