package com.hyman.date0622_0624.proxy2;


/**
 * @program: javalearning
 * @Date: 2018/6/22 16:50
 * @Author: hyman.hu
 * @Description:
 */
public class RealSubject implements Subject {
    /**
     * 执行给定名字的任务。这里打印出任务名，并休眠500ms模拟任务执行了很长时间
     * @param taskName
     */
    @Override
    public void dealTask(String taskName) {
        System.out.println("正在执行任务："+taskName);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
