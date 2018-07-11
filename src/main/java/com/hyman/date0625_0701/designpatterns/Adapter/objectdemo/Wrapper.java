package com.hyman.date0625_0701.designpatterns.Adapter.objectdemo;

import com.hyman.date0625_0701.designpatterns.Adapter.classdemo.Source;
import com.hyman.date0625_0701.designpatterns.Adapter.classdemo.Targetable;

/**
 * @program: javalearning
 * @Date: 2018/6/26 17:26
 * @Author: hyman.hu
 * @Description:
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
