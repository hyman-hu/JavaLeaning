package com.hyman.date0622_0624.genericitydemo;

/**
 * @program: javalearning
 * @Date: 2018/6/22 17:50
 * @Author: hyman.hu
 * @Description:
 */
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
