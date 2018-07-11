package com.hyman.date0625_0701.designpatterns.Adapter.classdemo;

/**
 * @program: javalearning
 * @Date: 2018/6/26 17:19
 * @Author: hyman.hu
 * @Description:
 */
public class Adapter extends Source implements Targetable  {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
