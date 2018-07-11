package com.hyman.date0702_0708.threaddemo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: javalearning
 * @Date: 2018/7/10 16:33
 * @Author: hyman.hu
 * @Description:
 */
public class Cache {
    static Map<String,Object> map = new HashMap<>();
    static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    static Lock readLock = rwl.readLock();
    static Lock writeLock =rwl.writeLock();
    /**
     * 获取Key
     * @param key
     * @return
     */
    public static Object get(String key){
        readLock.lock();//上锁
        try{
            return  map.get(key);
        }finally {
            readLock.unlock();//解锁
        }
    }

    /**
     * 添加元素
     * @param key key
     * @param value value
     * @return 添加结果
     */
    public static Object put(String key,Object value){
        writeLock.lock();//上锁
        try{
            return map.put(key,value);
        }finally {
            writeLock.unlock();//解锁
        }
    }

    /**
     * 清楚Map缓存
     */
    public static void clear(){
        writeLock.lock();//上锁
        try{
            map.clear();
        }finally {
            writeLock.unlock();
        }
    }
}
