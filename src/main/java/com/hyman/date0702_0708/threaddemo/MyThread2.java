package com.hyman.date0702_0708.threaddemo;

/**
 * @program: javalearning
 * @Date: 2018/7/3 15:59
 * @Author: hyman.hu
 * @Description:
 */
public class MyThread2 implements Runnable {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //创建线程目标对象
            Runnable r = new MyThread2();
            //把目标对象传递进Thread，即虚拟的CPU
            new Thread(r, "thread" + i).start();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
