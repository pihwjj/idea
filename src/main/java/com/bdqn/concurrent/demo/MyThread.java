package com.bdqn.concurrent.demo;

/**
 * 创建线程的方式
 * 继承 Thread 类
 */
public class MyThread extends Thread {


    @Override
    public void run() {
        System.err.println(Thread.currentThread().getName());
    }

    public static void main(String args[]){
        Thread thread = new MyThread();
        thread.setName("军军");
        thread.start();
    }


}
