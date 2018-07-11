package com.hyman.date0702_0708.threaddemo;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: javalearning
 * @Date: 2018/7/10 17:16
 * @Author: hyman.hu
 * @Description:
 */
public class Cache2 {
    volatile HashMap<String, String> cacheMap = new HashMap<>();
    ReadWriteLock rwLock = new ReentrantReadWriteLock();
    public String getS(String key) {
        rwLock.readLock().lock();
        String value = null;
        try {
            if (cacheMap.get(key) == null) {
                rwLock.readLock().unlock();
                rwLock.writeLock().lock();
                try {
                    //这里需要再次判断，防止后面阻塞的线程再次放入数据
                    if (cacheMap.get(key) == null) {
                        value = "" + Thread.currentThread().getName();
                        cacheMap.put(key, value);
                        System.out.println(Thread.currentThread().getName() + "put the value" + value);
                    }
                } finally {
                    //这里是锁降级，读锁的获取与写锁的释放顺序不能颠倒
                    rwLock.readLock().lock();
                    rwLock.writeLock().unlock();
                }
            }
        } finally {
            rwLock.readLock().unlock();
        }
        return cacheMap.get(key);
    }
}
