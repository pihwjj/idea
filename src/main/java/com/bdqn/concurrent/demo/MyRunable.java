package com.bdqn.concurrent.demo;

/**
 * 线程实现方式
 * 实现 Runnable 接口 啊啊啊
 */
public class MyRunable implements Runnable {

    @Override
    public void run() {
        System.err.println(Thread.currentThread().getName());
    }

    public static void main(String args[]){
        Thread thread = new Thread(new MyRunable());
        thread.setName("wang军军");
        thread.start();
    }
}
