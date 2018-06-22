package com.hyman.date0622_0624.genericitydemo;

import org.junit.Test;

/**
 * @program: javalearning
 * @Date: 2018/6/22 17:46
 * @Author: hyman.hu
 * @Description:
 */
public class BoxTest {
    public static void main(String[] args) {
        Box<User> box = new Box<>();
        User user = new User("hyman",12);
        box.setT(user);
        System.out.println(box.getT().getName());
    }

    @Test
    public void testCompare(){
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean result = CompareUtils.compare(p1, p2);
        System.out.println(result);
    }
}
