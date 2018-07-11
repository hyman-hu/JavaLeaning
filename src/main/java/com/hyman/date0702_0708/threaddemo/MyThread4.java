package com.hyman.date0702_0708.threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: javalearning
 * @Date: 2018/7/3 16:17
 * @Author: hyman.hu
 * @Description:
 */
public class MyThread4 {
    /* POOL_NUM */
    private static int POOL_NUM = 10;

    /**
     * Main function
     */
    public static void main(String[] args) {
        // 1. 创建一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < POOL_NUM; i++) {
            RunnableThread thread = new RunnableThread();
            executorService.execute(thread);
        }
    }
}

class RunnableThread implements Runnable {
    private int THREAD_NUM = 10;

    public void run() {
        for (int i = 0; i < THREAD_NUM; i++) {
            System.out.println("线程" + Thread.currentThread() + " " + i);
        }
    }

}
