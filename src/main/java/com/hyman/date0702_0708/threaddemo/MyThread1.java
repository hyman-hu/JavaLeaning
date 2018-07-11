package com.hyman.date0702_0708.threaddemo;

/**
 * @program: javalearning
 * @Date: 2018/7/3 15:56
 * @Author: hyman.hu
 * @Description: 线程测试
 */
public class MyThread1 extends Thread {
    public MyThread1(String name){
        super(name); //传递线程的名字
    }
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            new MyThread1("thread"+i).start();
        }
    }
    @Override
    public void run(){
        for(int i=0;i<20;i++){	//输出线程名字和i
            System.out.println(this.getName()+":"+i);
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
