package com.hyman.date0625_0701.designpatterns.Adapter.classdemo;

import com.hyman.date0625_0701.designpatterns.Adapter.objectdemo.Wrapper;
import org.junit.Test;

/**
 * @program: javalearning
 * @Date: 2018/6/26 17:19
 * @Author: hyman.hu
 * @Description:
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }

    @Test
    public void testMethod(){
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
