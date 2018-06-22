package com.hyman.date0622_0624.genericitydemo;

/**
 * @program: javalearning
 * @Date: 2018/6/22 17:51
 * @Author: hyman.hu
 * @Description:
 */
public class CompareUtils {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
