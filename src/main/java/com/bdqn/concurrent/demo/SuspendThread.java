package com.bdqn.concurrent.demo;

/**
 * 模拟线程挂起
 */
public class SuspendThread implements Runnable {

    @Override
    public void run() {
        System.err.println(Thread.currentThread().getName()+"执行 Run方法，开始调用 suspend 方法");
        //挂起线程
        Thread.currentThread().suspend();
        System.err.println(Thread.currentThread().getName()+"执行 Run方法，调用 suspend 方法结束");
    }

    public static void main(String args[]) throws InterruptedException {
        Thread thread = new Thread(new SuspendThread());
        thread.setName("wang");
        thread.start();
        Thread.sleep(5000L);
        //唤醒线程
        thread.resume();
    }
}
