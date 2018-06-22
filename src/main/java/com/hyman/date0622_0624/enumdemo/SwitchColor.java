package com.hyman.date0622_0624.enumdemo;

import org.junit.Test;
import sun.misc.Signal;

/**
 * @program: javalearning
 * @Date: 2018/6/22 17:09
 * @Author: hyman.hu
 * @Description: 选择Color
 */
public class SwitchColor {
    Color color = Color.RED;

//    public void switchColor() {
//        switch (color) {
//            case RED:
//                color = Color.GREEN;
//                break;
//            case YELLOW:
//                color = Color.RED;
//                break;
//            case GREEN:
//                color = Color.YELLOW;
//                break;
//        }
//    }

    @Test
    public void testColor(){
        Color color =  Color.RED;
//        System.out.println(color);
//        color.setIndex(10);
//        color.setName("WOWO");
//        System.out.println(color);
        color.print();
    }
}
